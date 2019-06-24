package com.purva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.purva.model.User;
import com.purva.service.UserService;

@RestController
@RequestMapping("/spring-data-jpa")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@PathVariable int id, @RequestBody User user) {
		userService.updateUser(id, user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		userService.deleteUser(id);
	}
	
	@GetMapping("/getUserByProfession/{profession}")
	public List<User> getUserByProfession(@PathVariable String profession) {
		return userService.getUserByProfession(profession);
	}
	
	@GetMapping("/getUserCount/{age}")
	public String getCount(@PathVariable int age) {
		long count = userService.getCount(age);
		return "Total no of records: " + count;
	}
	
	/*@DeleteMapping("/deleteUser/{name}")
	public List<User> deleteUser(@PathVariable String name) {
		return userService.deleteUser(name);
	}*/
}
