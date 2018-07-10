package com.opus.webservices.springdbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opus.webservices.springdbservice.model.User;

public interface UserRepository extends JpaRepository<User, String>{
	List<User> findAllUsers();
}
