package com.codelearnhub.example.Encapsulation;

public class BankAccount {
	private String accountNumber;
	private double balance;

	

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	// public method to deposit money
	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	// public method to withdraw money
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

}
