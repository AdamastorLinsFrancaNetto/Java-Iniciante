package exercicios;

import java.util.Scanner;

public class SeNumerosSaoIguaisOuDiferentes {
	
	public static void main(String[] args) {
		
		//Fa�a um algoritmo que leia dois valores inteiros A e B se os valores forem iguais dever� se somar os dois, caso contr�rio multiplique A por B. Ao final de qualquer um dos c�lculos deve-se atribuir o resultado para uma vari�vel C e mostrar seu conte�do na tela.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("A: ");
		double a = input.nextDouble();
		System.out.print("B: ");
		double b = input.nextDouble();
		
		if (a == b) {
			double c = a+b;
			System.out.printf("A e B s�o iguais ent�o soma eles dando C = %.1f", c);
		} else {
			double c = a*b;
			System.out.printf("A e B s�o diferentes ent�o multiplica eles dando C = %.1f", c);
		}
		
		input.close();
	}

}
