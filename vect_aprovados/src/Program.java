import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão avaliados? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] grade1 = new double[n];
		double[] grade2 = new double[n];
		double[] avg = new double[n];
		
		for ( int i = 0 ; i < n ; i++ ) {
			System.out.printf("Digite o nome, primeira e segunda nota do %dº aluno: \n", i+1);
			sc.nextLine();
			name[i] = sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
			avg[i] = (grade1[i] + grade2[i]) / 2; 
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i=0;i<n;i++) {
			if ( avg[i] >= 6.0 ) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
