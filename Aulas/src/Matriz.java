import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println(" ");

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.println(" ");
		
		for (int i=0; i<n; i++) {
				System.out.print(mat[i][i] + " ");
		}
		
		sc.close();
	}

}
