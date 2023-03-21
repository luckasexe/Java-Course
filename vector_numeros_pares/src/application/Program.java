package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int pares = 0;
		for ( int i = 0 ; i < n ; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] % 2 == 0 ) {
				pares++;
			}
			
		}
		
		System.out.println("");
		System.out.println("NUMEROS PARES:");
		
		for ( int i = 0 ; i < n ; i++) {	
			if (vect[i] % 2 == 0 ) {
				System.out.print(vect[i] + " ");
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d",pares);
		sc.close();
	}

}
