package exercicios;

import java.util.Scanner;

public class NumerosPrimos {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Informe um número para saber se ele é primo ou não: ");
		int n = input.nextInt();
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0 && n != 1) {
			System.out.println("O número " + n + " é primo.");
		} else {
			System.out.println("O número " + n + " NÃO é primo.");
		}
	
		input.close();
	}

}
