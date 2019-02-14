package com.example.cassandra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cassandra.modal.User;
import com.example.cassandra.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@RequestMapping ("/")
	public String Home() {
		return "home.html";
	}

	@RequestMapping ("/add")
	@ResponseBody
	public String add() {
		User user=new User();
		user.setId(1);
		user.setName("Ali");
		user.setAddress("Shenzhen");
		user.setAge(32);
		repository.save(user);
		return "User Added Succeffully";
	}
	
	@RequestMapping ("/allusers")
	@ResponseBody
	public Iterable<User> getAllUsers() {
		Iterable<User> user=repository.findAll();
		return user;
		 
	}
	
}
