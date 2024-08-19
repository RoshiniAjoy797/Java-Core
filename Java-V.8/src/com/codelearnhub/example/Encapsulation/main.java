package com.codelearnhub.example.Encapsulation;

public class main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("HSD56V8900987", 7000);
		account.setBalance(5000);
 		account.deposite(50); //deposit money
		//withdraw money
		if(account.withdraw(1)) {
			System.out.println(" Withdrawal succsessful!");
		}else {
			System.out.println("Insufficient funds!"); 
		}
 System.out.println("Current balace: Rs."+account.getBalance());
	}

}
