package com.opus.webservices.springdbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opus.webservices.springdbservice.model.User;
import com.opus.webservices.springdbservice.repository.UserRepository;

@RestController
@RequestMapping("/rest/db")
public class BotUserController {
	
	private UserRepository userRepository;
	
	public BotUserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<String> getUsers() {
		
		return (List<String>) userRepository.findAllUsers()
				.stream()
				.map(User::getUsername)
				.collect(Collectors.toList());	
	}

}
