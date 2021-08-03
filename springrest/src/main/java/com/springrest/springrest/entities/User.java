package com.springrest.springrest.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class User {

	@Id
	public Long userId;
	public String name;
	public String email;
	public String role;
	public Date last_login_at;
	public Date created_at;
	public Date updated_at;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long userId,String name, String email, String role) {
		super();
		this.userId=userId;
		this.name = name;
		this.email = email;
		this.role = role;
		//this.last_login_at = last_login_at;
		//this.created_at = created_at;
		//this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", role=" + role + ", last_login_at=" + last_login_at
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getLast_login_at() {
		return last_login_at;
	}
	public void setLast_login_at(Date last_login_at) {
		this.last_login_at = last_login_at;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
