package exercicios;

import java.util.Scanner;

public class JogoAdivinhação {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero = 15;
		int n = 0;
		int tentativas = 5;

		System.out.println("Você tem 5 tentativas para advinhar o número secreto!");

		while (numero != n && tentativas != 0) {
			System.out.print("\nDigite um número de 0 à 50: ");
			n = input.nextInt();
	
			if (n < numero) {
				System.out.println("\nO número secreto é maior!");
			} else if (n > numero) {
				System.out.println("\nO número secreto é menor!");
			} else {
				System.out.println("");
			}
			if (n != numero) {
				tentativas -= 1;
				System.out.printf("Você tem %d tentativas!\n", tentativas);
			}
		}
		if (tentativas == 0 ) {
			System.out.println("\n\nVOCÊ PERDEU, FIM DE JOGO !!!");
		}
		if (n == numero) {
			System.out.println("PARABÉNS VOCÊ ACERTOU !!!");
		}
		input.close();
	}

}
