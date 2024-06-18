package com.firstapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.firstapp.dao.UserDAO;
import com.firstapp.model.User;
import com.firstapp.utils.ActionResponse;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userdao;
	@Transactional
	public ActionResponse register(User user) {
		// TODO Auto-generated method stub
		
		return userdao.register(user);
	}
	@Transactional
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userdao.getUsers();
	}

}
