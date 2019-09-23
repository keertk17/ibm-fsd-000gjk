package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	@Column(name="name")
	private String name;
	@Column(name="mobile")
	private String mobileNumber;
	@Column(name="email")
	private String email;
	@Column(name="skills")
	private String skills;
	
	
	public Employee() {
		super();
	}
	public Employee(String name, String mobileNumber, String email, String skills) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
}
