package com.imozayozturk.objects;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6671232981235527228L;
	@Getter
	@Setter
	private long id;
	@Getter
	@Setter
	private String userId;
	@Getter
	@Setter
	private String firstName;
	@Getter
	@Setter
	private String lastName;
	@Getter
	@Setter
	private String email;
	@Getter
	@Setter
	private String password;
	@Getter
	@Setter
	private String encryptedPassword;
	@Getter
	@Setter
	private String emailToken;
	@Getter
	@Setter
	private Boolean emailStatus = false;

}
