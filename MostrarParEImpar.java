package exerciciosjava;

import java.util.Scanner;

public class MostrarParEImpar {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que solicite ao usu�rio 10 n�meros inteiros e, ao final, informe a quantidade de n�meros �mpares e pares lidos. 
		//Calcule tamb�m a soma dos n�meros pares e a m�dia dos n�meros �mpares
		
		Scanner input = new Scanner(System.in);
		int count = 1;
		int par = 0;
		int impar = 0;
		int somaP = 0;
		int somaI = 0;
		int neutro = 0;
		while (count <= 10) {
			System.out.printf("Informe o %d� n�mero: ", count);
			int n = input.nextInt();
			if (n%2 == 0) {
				if (n >= 1) {
					par++;
					somaP+=n;
				} else {
					neutro++;
				}
			} else {
				impar++;
				somaI+=n;
			}
			count++;
		}
		if (neutro == 10) {
			System.out.println("\nForam informados 10 n�meros 0 que s�o neutros.");
		}
		if (par > 0 && par == 1) {
			System.out.printf("\nFoi informado %d n�mero PAR com valor %d.", par, somaP);
		} else if (par >= 2) {
			System.out.printf("\nForam informados %d n�meros PARES.", par);
			System.out.printf("\nA soma dos n�meros PARES � igual �: " + somaP);
		} else {
			System.out.println("\nN�o foi informado nenhum n�mero PAR.");
		}
		if (impar > 0 && impar == 1) {
			System.out.printf(" Foi informado %d n�mero �MPAR com valor %d", impar, somaI);
		} else if (impar >= 2) {
			System.out.printf("\nForam informados %d n�meros �MPARES.", impar);
			int mediaI = somaI/impar;
			System.out.printf("\nA m�dia dos n�meros �MPARES �: " + mediaI);
		} else {
			System.out.println("N�o foi informado nenhum n�mero �MPAR.");
		}
		input.close();

	}

}
