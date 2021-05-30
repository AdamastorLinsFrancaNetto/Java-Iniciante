package exercicios;

import java.util.Scanner;

public class NumerosMaiores {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que receba como entrada cinco números e informe quantos desses números são maiores que 10.
		
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		int maior = 0;
		
		while (count <=5) {
			System.out.printf("Informe o %dº: ",count);
			double n1 = input.nextDouble();
			if (n1 > 10) {
				maior++;
			}
			count++;
		}
		if (maior > 1) {
			System.out.printf("\nDos números citados acima %d são maiores que 10.", maior);
		} else if (maior == 1) {
			System.out.printf("\nDos números citados acima apenas %d é maior que 10.", maior);
		} else {
			System.out.println("\nDos números citados acima nenhum é maior que 10.");
		}

		input.close();
	}

}
