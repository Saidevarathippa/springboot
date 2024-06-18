package com.firstapp.service;

import java.util.List;

import com.firstapp.model.User;
import com.firstapp.utils.ActionResponse;

public interface UserService {

	public ActionResponse register(User user);
	public List<User> getUsers();
}
