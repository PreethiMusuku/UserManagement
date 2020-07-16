package com.cg.usermanagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.usermanagement.entity.UserDto;
import com.cg.usermanagement.exception.InvalidDetailsException;
import com.cg.usermanagement.service.UpdateService;

@RestController
@RequestMapping("/UserManagement")
@CrossOrigin("http://localhost:4200")

public class UserManagementController
{

	@Autowired
	UpdateService updateserviceobj;
	

	@PostMapping(value="/createuser")
	public UserDto createUser(@RequestBody UserDto userDto) 
	{
		UserDto result= updateserviceobj.createUser(userDto);
		
		return result;
		
	}
	
   @DeleteMapping(value="/deleteuser/{userid}")
   public String deleteUser(@PathVariable int userid) throws InvalidDetailsException{
   
	    updateserviceobj.deleteUser(userid);
	  return "user deleted";
	   
   }
}
