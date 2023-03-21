package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;		
		double sum = 0;


		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0 ; i < vect.length ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		for (int i = 0 ; i < vect.length ; i++) {
			sum += vect[i];

		}
		double avg = sum / vect.length;

		System.out.print("VALORES = ");
		for (int i = 0 ; i < vect.length ; i++) {
			System.out.print(" " + vect[i]);
		}
		System.out.println("");
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);


		sc.close();
	}

}
