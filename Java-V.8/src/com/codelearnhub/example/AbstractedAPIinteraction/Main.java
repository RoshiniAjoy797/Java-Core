package com.codelearnhub.example.AbstractedAPIinteraction;

/*
 * Client Code (Using the API) 
 */
public class Main {
	public static void main(String[] args) {
		IUserService userService = new UserServiceImpl();

		// Interact with the API, unaware of the implementation details
		userService.createUser("John_Britto", "john@yahoo.com");

		User user = userService.getUser("John_Britto");
		System.out.println("Retrieved user : " + user.getEmail());

		userService.updateUser("John_Britto", "johnb@gmail.com");

		userService.deleteUser("John_Britto");

	}
}
