package com.example.cassandra.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

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
		
		user.setId(6);
		user.setName("Zain");
		user.setAddress("Sialkot");
		user.setAge(18);
		repository.save(user);
		return "New User  Succeffully";
	}
	
	@RequestMapping ("/allusers")
	@ResponseBody
	public Iterable<User> getAllUsers() {
		Iterable<User> user=repository.findAll();
		return user;
		 
	}
	
}
