package com.cg.usermanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.usermanagement.dao.UpdateDao;
import com.cg.usermanagement.entity.UserDto;
import com.cg.usermanagement.exception.InvalidDetailsException;

@Service

public class UpdateServiceImpl  implements UpdateService
{
	@Autowired
	UpdateDao updatedaoobj;

	
	@Override
	public UserDto createUser(UserDto userDto1) {
	
		updatedaoobj.save(userDto1);
		return userDto1;

	}

	@Override
	public void deleteUser(int userid) throws InvalidDetailsException {
		Optional<UserDto> userobj=updatedaoobj.findById(userid);
		if(userobj.isPresent()) 
        {
		updatedaoobj.deleteById(userid);
        }
		else
		{
			throw new InvalidDetailsException("User not found!!!!!!!!!!");
		}
	}


}




