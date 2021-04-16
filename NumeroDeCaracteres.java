package exerciciosjava;

import java.util.Scanner;

public class NumeroDeCaracteres {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("Informe uma palavra: ");
		String palavra = input.nextLine().toUpperCase();
		
		System.out.println("\nA palavra tem " + palavra.length() + " letras.\n");
		
		char letras [] = palavra.toCharArray();
		
		for (int i = 0; i <letras.length; i++) {
			count++;
			System.out.printf("%dª letra: ", count);
			System.out.println(letras[i]);
		}
		input.close();
	}

}
