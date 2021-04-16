package exerciciosjava;

import java.util.Scanner;

public class Valida��oDeInformacoes {

	public static void main(String[] args) {

		// #Fa�a um programa que leia e valide as seguintes informa��es:
		// Nome: maior que 2 caracteres;
		// Idade: entre 0 e 150;
		// Sal�rio: maior que zero;
		// Sexo: 'f' ou 'm';
		// Estado Civil: 's', 'c', 'v', 'd';

		Scanner input = new Scanner(System.in);

		String nome = "a";
		int idade = 0;
		double salario = 0;
		String sexo = "a";
		String estCiv = "a";
		
		while (nome.length() <= 2) {
			System.out.print("Informe seu nome: ");
			nome = input.nextLine();
		}
		while (idade <=0 || idade >= 150) {
			System.out.print("Informe sua idade: ");
			idade = input.nextInt();
		}
		while (salario <= 0) {
			System.out.print("Informe seu sal�rio: ");
			salario = input.nextDouble();
		}
		while (!sexo.equalsIgnoreCase("f") && 
				!sexo.equalsIgnoreCase("m") && 
				!sexo.equalsIgnoreCase("feminino") && 
				!sexo.equalsIgnoreCase("masculino")) {
			System.out.print("Informe seu sexo: ");
			sexo = input.next();
		}
		while (!estCiv.equalsIgnoreCase("s") &&
				!estCiv.equalsIgnoreCase("c") &&
				!estCiv.equalsIgnoreCase("v") &&
				!estCiv.equalsIgnoreCase("d")) {
			System.out.print("Informe seu estado civil: ");
			estCiv = input.next();
		}
		System.out.println("\nFim do questin�rio!");
			
		input.close();

	}

}
