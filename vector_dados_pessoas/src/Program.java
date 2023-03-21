import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão analisadas?");
		int n = sc.nextInt();
		
		double[] high = new double[n];
		char[] gender = new char[n];
		
		for ( int i = 0 ; i < n ; i++ ) {
			System.out.printf("Altura da %dª pessoa: ",i+1 );
			high[i] = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ",i+1);
			gender[i] = sc.next().charAt(0);
		}
		double shorter = high[0];
		double taller = high[0];
		double womenHigh = 0;
		double avgWomenHigh = 0;
		int totalWomen = 0;
		int totalMen = 0;
		for ( int i = 0 ; i < n ; i++ ) {
			// menor altura
			if ( high[i] < shorter ) {
				shorter = high[i];
			}
			// maior altura
			if ( high[i] > taller ) {
				taller = high[i];
			}
			// media das alturas das mulheres
			if ( gender[i] == 'F') {
				totalWomen++;
				womenHigh += high[i];
			}
			// numeros de homens
			if ( gender[i] == 'M') {
				totalMen++;
			}
		}
		
		avgWomenHigh = womenHigh / totalWomen;
		
		System.out.printf("Menor altura = %.2f%n", shorter);
		System.out.printf("Maior alutra = %.2f%n", taller);
		System.out.printf("Media das altura entre as mulheres = %.2f%n",avgWomenHigh);
		System.out.printf("Número de homens = " + totalMen);
		
		
		
		
		sc.close();
	}

}
