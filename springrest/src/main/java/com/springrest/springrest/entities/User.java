package com.springrest.springrest.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
public class User {

	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "userId", updatable = false, nullable = false)
	public String userId;
	public String name;
	public String gender;
	public String email;			
	public String role="student";
	public String status="INACTIVE";
	public int age;
	public Date last_login_at;
	@CreationTimestamp
	public Date created_at;
	@UpdateTimestamp
	public Date updated_at;
	public User() {
		super();
	}
	public User(String userId,String name, String email, String status, int age) {
		super();
		this.userId=userId;
		this.name = name;
		this.email = email;
		this.role = status;
		this.age=age;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
