package com.incident.mgmt.service;

import com.incident.mgmt.entity.Login;
import com.incident.mgmt.entity.User;

public interface UserService {

	public Object addUser(User user);

	public Object updateUser(User user);

	public User login(Login login);

}
