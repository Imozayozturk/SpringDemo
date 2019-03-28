package com.imozayozturk.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imozayozturk.business.IUserService;
import com.imozayozturk.objects.UserDto;
import com.imozayozturk.ui.model.command.UserCommand;
import com.imozayozturk.ui.model.query.UserQuery;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping
	public String getUser() {
		return "get user was called";
	}

	@PostMapping
	public UserQuery createUser(@RequestBody UserCommand userCommand) {

		UserQuery result = new UserQuery();

		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userCommand, userDto);

		UserDto fromService = userService.createUser(userDto);
		BeanUtils.copyProperties(fromService, result);

		return result;
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
