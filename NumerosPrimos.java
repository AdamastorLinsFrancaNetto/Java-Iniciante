package exercicios;

import java.util.Scanner;

public class NumerosPrimos {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Informe um n�mero para saber se ele � primo ou n�o: ");
		int n = input.nextInt();
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0 && n != 1) {
			System.out.println("O n�mero " + n + " � primo.");
		} else {
			System.out.println("O n�mero " + n + " N�O � primo.");
		}
	
		input.close();
	}

}
