package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* @Entity annotation which means that this class is mapped to the table in the database */
@Entity
@Table(name = "employees")
public class Employee {

	@Id // @Id to the data member which will behave as the primary key attribute in the
		// table
	@GeneratedValue(strategy = GenerationType.IDENTITY) // to auto generate primary keys
	private long id;

	/* @Column annotation to map it to table and columns in the database */
	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "email_id")
	private String emailid;

	public Employee() {

	}

	// constructor with parameters
	public Employee(String firstname, String lastname, String emailid) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
	}

	// getter setter methods
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
