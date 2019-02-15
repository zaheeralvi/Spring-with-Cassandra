package com.example.cassandra.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cassandra.modal.User;
import com.example.cassandra.repository.UserRepository;
import com.google.common.base.Optional;

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
		user.setName("Abdullah");
		user.setAddress("Sialkot");
		user.setAge(18);
		repository.save(user);
		return "New User  Succeffully";
	}
	
	@RequestMapping ("/update")
	@ResponseBody
	public Iterable<User> update() {
		User user=new User();	
		user.setId(5);
		user.setName("Zain-ul-Abideen");
		repository.save(user);
		Iterable<User> users=repository.findAll();
		return users;
	}
	
	@RequestMapping ("/delete")
	@ResponseBody
	public String delete() {
		repository.deleteById(4);
		return "Deleted";
	}
	
	@RequestMapping ("/allusers")
	@ResponseBody
	public Iterable<User> getAllUsers() {
		Iterable<User> user=repository.findAll();
		return user;
		 
	}
	
}
