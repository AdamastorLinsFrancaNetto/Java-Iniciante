package exerciciosjava;

import java.util.Scanner;

public class SePositivoOuNegativo {
	
	public static void main(String[] args) {
		
		//Implemente um script Python para determinar se um dado número N informado pelo usuário é POSITIVO ou NEGATIVO.

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		double n1 = input.nextDouble();
		
		if (n1 > 0) {
			System.out.printf("O número %.1f é POSTIVO.", n1);
		} else if (n1 < 0) {
			System.out.printf("O número %.1f é NEGATIVO.", n1);
		} else {
			System.out.printf("O número %.1f é NEUTRO.", n1);
		}
		input.close();
	}

}
