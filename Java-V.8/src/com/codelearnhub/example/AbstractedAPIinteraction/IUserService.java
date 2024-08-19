package com.codelearnhub.example.AbstractedAPIinteraction;

public interface IUserService { // Abstraction

	void createUser(String username, String email);

	User getUser(String username);

	void updateUser(String username, String newEmail);

	void deleteUser(String username);
}
