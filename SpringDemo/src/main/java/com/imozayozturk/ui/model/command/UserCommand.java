package com.imozayozturk.ui.model.command;

import lombok.Getter;
import lombok.Setter;

public class UserCommand {

	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String surname;
	@Getter
	@Setter
	private String email;
	@Getter
	@Setter
	private String password;
}