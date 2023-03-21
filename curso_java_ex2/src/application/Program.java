package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee worker = new Employee();
		
		System.out.print("Name: ");
		worker.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		worker.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		worker.tax = sc.nextDouble();
		System.out.println(" ");
		
		System.out.println("Employee: " + worker);
		System.out.println(" ");
		
		System.out.print("Which percentage to increase salary? ");
		worker.increaseSalary(sc.nextDouble());
		System.out.println(" ");
		
		System.out.println("Updated data: " + worker);
		
		
		
		
		sc.close();
	}

}
