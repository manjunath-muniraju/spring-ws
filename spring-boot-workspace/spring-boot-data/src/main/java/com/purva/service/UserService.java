package com.purva.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.purva.model.User;
import com.purva.dao.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initDB() {
		List<User> users = new ArrayList<>();
		users.add(new User(111,"Manju","IT",25));
		users.add(new User(222,"Anil","IT",30));
		users.add(new User(333,"Ram","IT",40));
		users.add(new User(444,"Sham","IT",50));
		users.add(new User(555,"Raju","IT",60));
		userRepository.save(users);
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	public User getUser(int id) {
		return userRepository.findOne(id);
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(int id, User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(int id) {
		userRepository.delete(id); 
	}
	
	public List<User> getUserByProfession(String profession) {
		return userRepository.findByProfession(profession);
	}
	
	public long getCount(int age) {
		return userRepository.countByAge(age);
	}
	
	/*public List<User> deleteUser(String name) {
		return userRepository.deleteByName(name);
	}*/
	
}
