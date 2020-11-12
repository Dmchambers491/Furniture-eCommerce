package com.furniture.service;

import com.furniture.model.*;

public interface UserService {

  int register(UserModel user);

  UserModel validateUser(LoginModel login);
}