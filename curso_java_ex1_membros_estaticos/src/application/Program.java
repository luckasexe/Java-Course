package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.print("Hoe many dollar will be bought? ");
		CurrencyConverter.bought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = $ %.2f%n",CurrencyConverter.dollarToReal());
		
		sc.close();
	}

}
