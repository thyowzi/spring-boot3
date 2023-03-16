package com.douglas.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> encontrarTodos() {
		User u = new User(1L, "Larissa", "@japa.com", "1193214512", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
