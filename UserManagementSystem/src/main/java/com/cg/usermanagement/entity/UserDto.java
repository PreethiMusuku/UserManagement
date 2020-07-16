package com.cg.usermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdata")
public class UserDto
{
       @Id
       @GeneratedValue
       @Column(length=10)
       private int userid;
       @Column(length=50)
       private String email;
       @Column(length=10)
       private String firstName;
       @Column(length=10)
       private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDto [userid=" + userid + ", email=" + email + ", firstName=" + firstName + ", password=" + password
				+ "]";
	}
    public UserDto(int userid, String email, String firstName, String password) {
		super();
		this.userid = userid;
		this.email = email;
		this.firstName = firstName;
		this.password = password;
	}
	public UserDto() {
    	super();
    }
}



