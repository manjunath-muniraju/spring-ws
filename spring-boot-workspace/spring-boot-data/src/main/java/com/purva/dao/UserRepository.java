package com.purva.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purva.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByProfession(String profession);
	
	public long countByAge(int age);
	
	public List<User> deleteByName(String name);

}
