package exercicios;

import java.util.Scanner;

public class JogoAdivinha��o {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero = 15;
		int n = 0;
		int tentativas = 5;

		System.out.println("Voc� tem 5 tentativas para advinhar o n�mero secreto!");

		while (numero != n && tentativas != 0) {
			System.out.print("\nDigite um n�mero de 0 � 50: ");
			n = input.nextInt();
	
			if (n < numero) {
				System.out.println("\nO n�mero secreto � maior!");
			} else if (n > numero) {
				System.out.println("\nO n�mero secreto � menor!");
			} else {
				System.out.println("");
			}
			if (n != numero) {
				tentativas -= 1;
				System.out.printf("Voc� tem %d tentativas!\n", tentativas);
			}
		}
		if (tentativas == 0 ) {
			System.out.println("\n\nVOC� PERDEU, FIM DE JOGO !!!");
		}
		if (n == numero) {
			System.out.println("PARAB�NS VOC� ACERTOU !!!");
		}
		input.close();
	}

}
