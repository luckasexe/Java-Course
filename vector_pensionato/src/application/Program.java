package application;

import java.util.Scanner;

import entities.Guest;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Guest[] guest = new Guest[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for ( int i = 0 ; i < n ; i++ ) {
			System.out.printf("Rent #%d:\n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String mail = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			guest[room] = new Guest(name,mail,room);
		}

		System.out.println("Busy Rooms:");

		for ( int i = 0 ; i <= guest.length ; i++) {
			
			if ( guest[i] != null ) {
				System.out.printf("%d: %s, %s\n",guest[i].getRoom(),guest[i].getName(),guest[i].getMail());
			}
		}




		sc.close();

	}

}
