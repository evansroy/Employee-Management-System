package com.codewithroy.springboot.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;
	
	public Employee() {
		
	}
	
	public Employee(long id, String firstName, String lastName, String email, String phoneNumber, Date hireDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
	}
	// this method allows us to read the Id attribute
	public long getId() {

		return id;
	}


	// this method allows us to write to the Id attribute
	public void setId(long id) {

		this.id = id;
	}
	
	// this method allows us to read the FirstName attribute
	public String getFirstName() {

		return firstName;
	}
	
	// this method allows us to write to the firstName attribute
	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}
	
	// this method allows us to read the LastName attribute
	public String getLastName() {

		return lastName;
	}
	
	// this method allows us to write to the lastName attribute
	public void setLastName(String lastName) {

		this.lastName = lastName;
	}
	
	// this method allows us to read the email attribute
	public String getEmail() {

		return email;
	}
	
	// this method allows us to write to the email attribute
	public void setEmail(String email) {

		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}
