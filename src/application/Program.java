package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is the a initial deposit? (Y/N): ");
		char initial = sc.nextLine().charAt(0);
		
		Account account;
		
		if(initial == 'y') {
			System.out.print("Enter initial deposit deposit: ");
			double value = sc.nextDouble();
			account = new Account(number,name,value);
		}
		else {//if(initial == 'n') {
			account = new Account(number,name);
		}
		
		System.out.println("\n\nAccount data:");
		System.out.println(account.toString());
		
		System.out.print("\n\nEnter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		
		System.out.print("\n\nEnter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		
		sc.close();

	}

}
