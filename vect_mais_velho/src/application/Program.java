package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		Person[] person = new Person[n];

		int olderAge = 0;
		for ( int i = 0 ; i < person.length ; i++) {
			System.out.printf("Dados da %dª pessoas: \n", i+1);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();

			person[i] = new Person(name,age);

			if (person[i].getAge() > olderAge ) {
				olderAge = person[i].getAge();
			}
			
		}
		
		for ( int i = 0 ; i < person.length ; i++ ) { 
			if ( person[i].getAge() == olderAge ) {
				System.out.println("PESSOA MAIS VELHA: " + person[i].getName());
			}
		}





		sc.close();
	}

}
