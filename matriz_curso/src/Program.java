import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		for (int i = 0 ; i < mat.length ; i++) {
			for ( int j = 0 ; j < mat[i].length ; j++) {
				mat[i][j] = sc.nextInt();
			}			
		}
		
		System.out.println("Matriz: ");
		for (int i = 0 ; i < mat.length ; i++) {
			for ( int j = 0 ; j < mat[i].length ; j++) {
				System.out.print(mat[i][j] + " ");
			}	
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
