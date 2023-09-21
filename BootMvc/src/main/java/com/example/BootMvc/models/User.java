package com.example.BootMvc.models;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
	@Size(min = 3, max = 50)
	private String username;

	@NotBlank
	@Email(message = "Please enter a valid e-mail address")
	private String email;

	@NotBlank
	@Size(min = 8, max = 15)
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String birthDate;

	@NotBlank
	private String profession;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
