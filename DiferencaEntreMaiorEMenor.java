package exercicios;

import java.util.Scanner;

public class DiferencaEntreMaiorEMenor {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que receba como entrada dois valores num�ricos e apresente a diferen�a do maior pelo menor.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o 1� valor: ");
		double valor1 = input.nextDouble();
		System.out.print("Informe o 2� valor: ");
		double valor2 = input.nextDouble();
		
		if (valor1 > valor2) {
			System.out.printf("O 1� valor � maior que o 2� a diferen�a entre eles �: %.1f", valor1-valor2);
		} 
		if (valor2 > valor1) {
			System.out.printf("O 2� valor � maior que o 1� a diferen�a entre eles �: %.1f", valor2-valor1);	
		}
			
		
		input.close();
	}

}
