package com.firstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstapp.model.User;
import com.firstapp.service.UserService;
import com.firstapp.utils.ActionResponse;

@RequestMapping("/user")
@RestController
public class HomeController {

	@Autowired
	UserService userservice;
	@PostMapping("/register")
	public ResponseEntity<ActionResponse> register(@RequestBody User user){
		
		System.out.println(user.getEmail());
		System.out.println(user.getUsername());
		ActionResponse response=userservice.register(user);
		return new ResponseEntity<ActionResponse>(response,HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity getAllUsers(){
		
				List list=userservice.getUsers();
		return new ResponseEntity(list,HttpStatus.OK);
	}
}
