package com.imozayozturk.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imozayozturk.ui.model.command.UserC;
import com.imozayozturk.ui.model.query.UserQ;

@RestController
@RequestMapping("users")
public class UserController {

	@GetMapping
	public String getUser() {
		return "get user was called";
	}

	@PostMapping
	public UserQ createUser(@RequestBody UserC cmd) {
		return null;
	}

	@PutMapping
	public String updateUser() {
		return "update user was called";

	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
}
