import java.util.Locale;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0 ; i < vect.length ; i++) {
			System.out.printf("Digite o %dº numero: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		double highNumber = 0.0;
		int highPos = 0;
		
		for (int i = 0 ; i < vect.length ; i++) {
			if (vect[i] > highNumber) {
				highNumber = vect[i];
				highPos = i+1;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n", highNumber);
		System.out.printf("POSICAO DO MAIOR VALOR = %dº", highPos);
		
		
		
		
		sc.close();
		
	}

}
