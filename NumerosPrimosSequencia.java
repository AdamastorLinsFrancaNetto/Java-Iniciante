package exerciciosjava;

import java.util.Scanner;

public class NumerosPrimosSequencia {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Até que número deseja saber os números primos existentes? ");
		int nmax = input.nextInt();
		int count = 0;
		
		System.out.println("\n1");
		
		for(int n = 2; n <= nmax; n++) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(n + " é primo.");
			} else {
				System.out.println(n);
			}
		count=0;
		}
			input.close();		
	}
}
