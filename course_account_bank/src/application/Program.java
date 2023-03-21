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
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		Account cc = new Account(number,holder);
		
		System.out.print("Is there an inital deposit (y/n)? ");
		char validation = sc.next().charAt(0);
		if (validation == 'y' ) {
			System.out.print("Enter inital deposit value: ");
			cc.deposit(sc.nextDouble()); 
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(cc);
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		cc.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(cc);
		
		System.out.print("Enter a withdraw value: ");
		cc.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(cc);
		
		
		sc.close();
	}

}
