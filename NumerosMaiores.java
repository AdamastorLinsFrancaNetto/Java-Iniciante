package exercicios;

import java.util.Scanner;

public class NumerosMaiores {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que receba como entrada cinco n�meros e informe quantos desses n�meros s�o maiores que 10.
		
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		int maior = 0;
		
		while (count <=5) {
			System.out.printf("Informe o %d�: ",count);
			double n1 = input.nextDouble();
			if (n1 > 10) {
				maior++;
			}
			count++;
		}
		if (maior > 1) {
			System.out.printf("\nDos n�meros citados acima %d s�o maiores que 10.", maior);
		} else if (maior == 1) {
			System.out.printf("\nDos n�meros citados acima apenas %d � maior que 10.", maior);
		} else {
			System.out.println("\nDos n�meros citados acima nenhum � maior que 10.");
		}

		input.close();
	}

}
