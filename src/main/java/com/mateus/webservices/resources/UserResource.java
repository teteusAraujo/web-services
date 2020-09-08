package com.mateus.webservices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.webservices.entities.User;

@RestController
@RequestMapping(value = "/useres")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findALL(){
		User u = new User(1L, "Mateus Araujo", "mateusarajo9966@gmail.com", "(11)97765-6705", "naruto10");
		return ResponseEntity.ok().body(u);
	}
}
