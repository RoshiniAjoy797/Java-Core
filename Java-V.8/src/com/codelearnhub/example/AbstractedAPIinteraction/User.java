package com.codelearnhub.example.AbstractedAPIinteraction;

public class User {
	private String username;
	private String email;

	public User(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "User{" + "usernname= " + username + ", email= " + email + "}";

	}
}
