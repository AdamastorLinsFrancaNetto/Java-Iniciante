package exercicios;

import java.util.Scanner;

public class SeNumerosSaoIguaisOuDiferentes {
	
	public static void main(String[] args) {
		
		//Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("A: ");
		double a = input.nextDouble();
		System.out.print("B: ");
		double b = input.nextDouble();
		
		if (a == b) {
			double c = a+b;
			System.out.printf("A e B são iguais então soma eles dando C = %.1f", c);
		} else {
			double c = a*b;
			System.out.printf("A e B são diferentes então multiplica eles dando C = %.1f", c);
		}
		
		input.close();
	}

}
