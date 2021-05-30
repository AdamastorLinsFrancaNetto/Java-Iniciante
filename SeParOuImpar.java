package exercicios;

import java.util.Scanner;

public class SeParOuImpar {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que receba como dado de entrada um número inteiro e apresente na tela se o dado número é par ou impar. Ou seja, desenvolva um algoritmo que avalia a paridade de um número.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int n1 = input.nextInt();
		
		if (n1%2 == 0) {
			System.out.printf("\nO número %d é PAR.", n1);
		} else {
			System.out.printf("\nO número %d é ÍMPAR.", n1);
		}
		input.close();

	}

}
