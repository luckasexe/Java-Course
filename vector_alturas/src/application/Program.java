package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sumHeight = 0;
			
		System.out.print("Quantas pessoas serao digitas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		for ( int i = 0 ; i < vect.length ; i++) {
			System.out.printf("Dados da %da pessoa:%n",i+1);
			System.out.print("Nome: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			vect[i] = new Person(name,age,height);
			
			sumHeight += height;
		}
		double avgHeight = sumHeight / vect.length;
		
		int sumAge = 0;
		double avgAge = 0;
		for ( int i = 0 ; i < vect.length ; i++) {
			if ( vect[i].getAge() < 16) {
				sumAge++;
			}
			avgAge = sumAge * 100 / vect.length;			
		}
		
		System.out.println("");
		System.out.printf("Altura média: %.2f%n",avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", avgAge);
		
		
		for ( int i = 0 ; i < vect.length ; i++) {
			if ( vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}

}
