package com.tweeteroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweeteroo.api.dto.CreateUserDTO;
import com.tweeteroo.api.model.TUser;
import com.tweeteroo.api.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private UserRepository repository;

	@PostMapping("/sign-up")
	public String signUp(@RequestBody @Valid CreateUserDTO user) {
		repository.save(new TUser(user));
		return "OK";
	}

	@GetMapping
	public List<TUser> getAll() {
		return repository.findAll();
	}
}
