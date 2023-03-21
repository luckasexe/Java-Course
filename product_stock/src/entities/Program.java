package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Student;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n %s",student.grade,student.check());
		
		
		
		
		sc.close();

	}

}
