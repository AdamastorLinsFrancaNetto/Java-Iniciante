package exercicios;

import java.util.Scanner;

public class Categorias {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que recebe 3 números reais do teclado e verificar se o primeiro é maior que a soma dos outros dois.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("CATEGORIAS:"
				+ "\n- INFANTIL A: 5 a 7 anos"
				+ "\n- INFANTIL B: 8 a 10 anos"
				+ "\n- JUVENIL A: 11 a 13 anos"
				+ "\n- JUVENIL B: 14 a 17 anos"
				+ "\n- SÊNIOR: maiores de 18 anos\n");
		
		System.out.print("Informe a idade do nadador: ");
		int idade = input.nextInt();
		
		if (idade >= 5 && idade<= 7) {
			System.out.println("\nO nadador é da categoria INFANTIL A.");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("\nO nadador é da categoria INFANTIL B.");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("\nO nadador é da categoria JUVENIL A.");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("\nO nadador é da categoria JUVENIL B.");
		} else if (idade >= 18) {
			System.out.println("\nO nadador é da categoria SÊNIOR.");
		} else {
			System.out.println("\nNão tem categorias para abaixo de 5 anos.");
		}
		input.close();
	}

}
