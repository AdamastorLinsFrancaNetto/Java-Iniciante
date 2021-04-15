package exerciciosjava;

import java.util.Scanner;

public class CalculoPesoIdeal {
	
	public static void main(String[] args) {
		
		//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal.
		
		Scanner input = new Scanner(System.in);
		
		String sexo = "m";
		
		do {
			System.out.print("Informe seu sexo [M/F]: ");
			sexo = input.next();
		} while (!sexo.equalsIgnoreCase("m") && 
				!sexo.equalsIgnoreCase("f") &&
				!sexo.equalsIgnoreCase("feminino") &&
				!sexo.equalsIgnoreCase("masculino"));
		
		System.out.print("Informe seu altura: ");
		double altura = input.nextDouble();
		
		double pim = (72.7*altura)-58;
		double pif = (62.1*altura)-44.7;
		
		if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")) {
			System.out.printf("Seu peso ideal é: %.1f", pif);
		} else if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino")) {
			System.out.printf("Seu peso ideal é: %.1f", pim);
		}
		input.close();
		
	}

}
