package com.incident.mgmt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incident.mgmt.dao.UserDao;
import com.incident.mgmt.entity.Login;
import com.incident.mgmt.entity.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userRepo;

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		//Check email and mobile no.
		if((userRepo.findUserByEmailORMobile(user.getMobile(),user.getEmail())).size()==0){
			return userRepo.save(user).toString();
		}else {
			return "Mobile or Email already in used, Please provide Unique Mobile,Email OR try to login";
		}
	
	}
	
	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		//Check email and mobile no.
		Optional<User> oldRecord=userRepo.findById(user.getId());
		if(oldRecord.isPresent()){
			if(!(user.getMobile().equalsIgnoreCase(oldRecord.get().getMobile()) 
					&& user.getEmail().equalsIgnoreCase(oldRecord.get().getEmail()))) {
				
				// check user mobile/email not use by other user
				if((userRepo.findUserByEmailORMobileWithUserId(user.getMobile(), user.getEmail(),user.getId())).size()==0){
					return userRepo.save(user).toString();
				}else {
					return "Mobile or Email already in used, Please provide Unique Mobile.";
				}
				
			}
			return userRepo.save(user).toString();

			
		}else {
			return "User id not exist";
		}
	}

	@Override
	public String login(Login login) {
		// TODO Auto-generated method stub
		Optional<User> oldRecord = null;
		if(login.getEmail()!=null && login.getEmail().trim()!=null) {
			 oldRecord=userRepo.loginWithEmail(login.getEmail(),login.getPassword());

		} else if(login.getMobile()!=null && login.getMobile().trim()!=null) {
			 oldRecord=userRepo.loginWithMobile(login.getMobile(),login.getPassword());
		}
		if(oldRecord.isPresent()) {
			User user=oldRecord.get();
			user.setPassword(null);
			return user.toString();
		}
		return "Please provide valid credentials";
	}

}
