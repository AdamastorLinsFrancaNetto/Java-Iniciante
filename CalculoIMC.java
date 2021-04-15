package exerciciosjava;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		//Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		double peso = input.nextDouble();
		System.out.print("Informe sua altura: ");
		double altura = input.nextDouble();
		
		double imc = peso / (altura*altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		input.close();
	}

}
