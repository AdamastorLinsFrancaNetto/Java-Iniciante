package exercicios;

import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {

		// Implemente um script Java que leia um número N inteiro e apresente a soma de todos os números de 1 até n. Faça isso usando o laço while.

		Scanner input = new Scanner(System.in);

		// while
		System.out.print("Informe um número: ");
		int n = input.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.printf("\n%d + %d = %d", n, i, n + i);
			i++;
		}
		
		// for
		System.out.println("");
		int j = 1;
		for (; j <= n; j++) {
			System.out.printf("\n%d + %d = %d", n, j, n + j);
		
		input.close();
		}
		
	}

}
