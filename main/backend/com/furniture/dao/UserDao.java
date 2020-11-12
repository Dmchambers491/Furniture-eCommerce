package com.furniture.dao;

import com.furniture.model.*;

public interface UserDao {

	int register(UserModel user);
	
	UserModel validateUser(LoginModel login);
}
