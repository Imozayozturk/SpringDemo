package com.imozayozturk.business.implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imozayozturk.business.IUserService;
import com.imozayozturk.entity.UserEntity;
import com.imozayozturk.objects.UserDto;
import com.imozayozturk.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public UserDto createUser(UserDto userDto) {

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);

		UserEntity savedEntity = userRepository.save(userEntity);

		UserDto result = new UserDto();
		BeanUtils.copyProperties(savedEntity, result);

		return result;
	}

}
