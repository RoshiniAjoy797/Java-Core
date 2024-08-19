package com.codelearnhub.example.AbstractedAPIinteraction;

import java.util.*;

/*
 * Implementation Class (Hidden Details)
 */

public class UserServiceImpl implements IUserService {

	// Assume this is the data storage (abstracted from the user)
	private Map<String, User> userDatabase = new HashMap<>();

	@Override
	public void createUser(String username, String email) {
		userDatabase.put(username, new User(username, email));
		System.out.println("User created : " + username);
	}

	@Override
	public User getUser(String username) {
		return userDatabase.get(username);
	}

	@Override
	public void updateUser(String username, String newEmail) {
		User user = userDatabase.get(username);

		if (user != null) {
			user.setEmail(newEmail);
			System.out.println("User updated: " + user.getUsername() + ", " + user.getEmail());
		} else {
			System.out.println("User not found: " + username); // Handle the case where the user doesn't exist
		}
	}

	@Override
	public void deleteUser(String username) {
		User removedUser = userDatabase.remove(username);
		userDatabase.remove(username);
		if (removedUser != null) {
			System.out.println("User deleted : " + username);
		} else {
			System.out.println("User not found: " + username);
		}

	}
}
