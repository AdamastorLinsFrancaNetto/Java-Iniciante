package exerciciosjava;

import java.util.Scanner;

public class SePositivoOuNegativo {
	
	public static void main(String[] args) {
		
		//Implemente um script Python para determinar se um dado n�mero N informado pelo usu�rio � POSITIVO ou NEGATIVO.

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		double n1 = input.nextDouble();
		
		if (n1 > 0) {
			System.out.printf("O n�mero %.1f � POSTIVO.", n1);
		} else if (n1 < 0) {
			System.out.printf("O n�mero %.1f � NEGATIVO.", n1);
		} else {
			System.out.printf("O n�mero %.1f � NEUTRO.", n1);
		}
		input.close();
	}

}
