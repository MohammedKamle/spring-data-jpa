package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;

@Entity(name = "Student")
@Table(name = "Student", uniqueConstraints = {
		@UniqueConstraint(name ="student_email_unique", columnNames = "email")
})
public class Student {
	
	@Id
	@SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "student_sequence")
	private Long id;
	
	// @Column will map our data types to column in our database
	@Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
	private String firstName;
	
	@Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
	private String lastName;
	
	@Column(name = "email", nullable = false, columnDefinition = "TEXT")
	private String email;
	
	@Column(name = "age", nullable = false)
	private Integer age;
	
	// We have not taken "id" here as database will automatically generate it for us.
	public Student(String firstName, String lastName, String email, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + "]";
	}

}
