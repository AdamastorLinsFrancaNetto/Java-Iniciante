package exercicios;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		int maior = numero;
		int count = 1;
		
		while (count <= 10) {
			System.out.printf("Informe o %dº número: ", count);
			numero = input.nextInt();
			count++;
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("\nO maior número inserido foi: " + maior);
		input.close();
	}
}
