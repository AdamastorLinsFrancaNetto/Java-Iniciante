package exercicios;

import java.util.Scanner;

public class DiferencaEntreMaiorEMenor {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que receba como entrada dois valores numéricos e apresente a diferença do maior pelo menor.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o 1º valor: ");
		double valor1 = input.nextDouble();
		System.out.print("Informe o 2º valor: ");
		double valor2 = input.nextDouble();
		
		if (valor1 > valor2) {
			System.out.printf("O 1º valor é maior que o 2º a diferença entre eles é: %.1f", valor1-valor2);
		} 
		if (valor2 > valor1) {
			System.out.printf("O 2º valor é maior que o 1º a diferença entre eles é: %.1f", valor2-valor1);	
		}
			
		
		input.close();
	}

}
