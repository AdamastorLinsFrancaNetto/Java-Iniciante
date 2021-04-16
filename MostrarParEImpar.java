package exerciciosjava;

import java.util.Scanner;

public class MostrarParEImpar {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que solicite ao usuário 10 números inteiros e, ao final, informe a quantidade de números ímpares e pares lidos. 
		//Calcule também a soma dos números pares e a média dos números ímpares
		
		Scanner input = new Scanner(System.in);
		int count = 1;
		int par = 0;
		int impar = 0;
		int somaP = 0;
		int somaI = 0;
		int neutro = 0;
		while (count <= 10) {
			System.out.printf("Informe o %dº número: ", count);
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
			System.out.println("\nForam informados 10 números 0 que são neutros.");
		}
		if (par > 0 && par == 1) {
			System.out.printf("\nFoi informado %d número PAR com valor %d.", par, somaP);
		} else if (par >= 2) {
			System.out.printf("\nForam informados %d números PARES.", par);
			System.out.printf("\nA soma dos números PARES é igual à: " + somaP);
		} else {
			System.out.println("\nNão foi informado nenhum número PAR.");
		}
		if (impar > 0 && impar == 1) {
			System.out.printf(" Foi informado %d número ÍMPAR com valor %d", impar, somaI);
		} else if (impar >= 2) {
			System.out.printf("\nForam informados %d números ÍMPARES.", impar);
			int mediaI = somaI/impar;
			System.out.printf("\nA média dos números ÍMPARES é: " + mediaI);
		} else {
			System.out.println("Não foi informado nenhum número ÍMPAR.");
		}
		input.close();

	}

}
