package exercicios;

import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {

		// Implemente um script Java que leia um n�mero N inteiro e apresente a soma de todos os n�meros de 1 at� n. Fa�a isso usando o la�o while.

		Scanner input = new Scanner(System.in);

		// while
		System.out.print("Informe um n�mero: ");
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
