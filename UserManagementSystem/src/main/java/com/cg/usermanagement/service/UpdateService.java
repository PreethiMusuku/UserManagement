package com.cg.usermanagement.service;

import java.util.Optional;

import com.cg.usermanagement.entity.UserDto;
import com.cg.usermanagement.exception.InvalidDetailsException;

public interface UpdateService {

	

	UserDto createUser(UserDto userDto);

	void deleteUser(int userid)throws InvalidDetailsException;


}
