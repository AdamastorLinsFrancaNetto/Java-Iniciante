package exercicios;

import java.util.Scanner;

public class MediaDosVetores {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual tamanho do vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		double total = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Posição %d: ", i);
			vetor[i] = sc.nextDouble();
			total += vetor[i];
		}

		System.out.printf("A média dos vetores é: %.2f", total / vetor.length);
		
		sc.close();
	}

}
