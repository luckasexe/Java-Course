package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of products: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i<n;i++) {
			sc.nextLine();
			System.out.print("Product name: ");
			String name = sc.nextLine();
			System.out.print("Product price: ");			
			double price = sc.nextDouble();
			System.out.println("");
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for (int i = 0 ; i < n ; i++ ) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		
		System.out.println(avg);		
		
		sc.close();
	}
}
