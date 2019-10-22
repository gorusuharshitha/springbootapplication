package com.springbootjpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpademo.dao.UserRepository;
import com.springbootjpademo.model.User;
import com.springbootjpademo.service.UserService;

@RestController

public class UserController {
	@Autowired UserService userservice;
	@RequestMapping("/honey")
	    public List<User> readAll() {
	        return userservice.read();
	    }
	@RequestMapping("/create")
	    public void postDogs(@RequestBody User dto) {
	        userservice.add(dto);
	    }
	@RequestMapping("/readbyId/{id}")
	    public User getById(@PathVariable("id") int id) {
	        return userservice.getUserById(id);
	    }
	   @DeleteMapping("delete/{id}")
	    public void delete(@PathVariable("id") int id) {
	        userservice.deleteuser(id);
	    }
	   @RequestMapping("/update/{id}")
	    public User getById(@RequestBody User dto, @PathVariable("id") int id) {
	        return userservice.update(dto,id);
	    }
	}

	


