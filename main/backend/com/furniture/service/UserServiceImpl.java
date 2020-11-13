package com.furniture.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.furniture.dao.*;
import com.furniture.model.*;

public class UserServiceImpl implements UserService{
	
	@Autowired
	public UserDao userDao;
	
	public int register(UserModel user) {
		return userDao.register(user);
	}
	
	public UserModel validateUser(LoginModel login) {
		return userDao.validateUser(login);
	}

}
