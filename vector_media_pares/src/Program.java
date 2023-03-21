import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for ( int i = 0 ; i < n ; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			vect[i] = sc.nextDouble();
		}
		double sum = 0;
		int sumi = 0;
		for ( int i = 0 ; i < n ; i++) {
			if (vect[i] % 2 == 0 ) {
				sum += vect[i];
				sumi++;
			}
		}
		
		if ( sumi > 0 ) {
		double avg = sum /sumi; 
		System.out.printf("MEDIA DOS PARES = %.1f", avg);
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		sc.close();

	}

}
