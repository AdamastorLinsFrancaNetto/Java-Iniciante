package exercicios;

import java.util.Scanner;

public class SeParOuImpar {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que receba como dado de entrada um n�mero inteiro e apresente na tela se o dado n�mero � par ou impar. Ou seja, desenvolva um algoritmo que avalia a paridade de um n�mero.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int n1 = input.nextInt();
		
		if (n1%2 == 0) {
			System.out.printf("\nO n�mero %d � PAR.", n1);
		} else {
			System.out.printf("\nO n�mero %d � �MPAR.", n1);
		}
		input.close();

	}

}
