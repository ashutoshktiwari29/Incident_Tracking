package com.incident.mgmt.service;

import com.incident.mgmt.entity.Login;
import com.incident.mgmt.entity.User;

public interface UserService {

	public String addUser(User user);

	public String updateUser(User user);

	public String login(Login login);

}
