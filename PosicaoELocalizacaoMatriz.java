package exercicios;

import java.util.Scanner;

public class PosicaoELocalizacaoMatriz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de linhas: ");
		int linhas = sc.nextInt();
		System.out.print("Número de colunas: ");
		int colunas = sc.nextInt();
		System.out.println();
		
		int[][] matriz = new int[linhas][colunas];
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Linha %d, coluna %d: ", l, c);
				matriz[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("\nMATRIZ:");
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.printf("[" + matriz[l][c] + "]");
			}
		System.out.println();
		}
		
		System.out.print("\nProcurar número na matriz: ");
		int procurado = sc.nextInt();
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				if (matriz[l][c] == procurado) {
					System.out.printf("\nPosição L: %d, C: %d%n", l, c);
					
					if (l > 0) {
						System.out.println("Cima: " + matriz[l-1][c]);
					} else {
						System.out.println("Cima: ");
					}
					
					if (l < matriz.length-1) {
						System.out.println("Baixo: " + matriz[l+1][c]);
					} else {
						System.out.println("Baixo: ");
					}
					
					if (c > 0) {
						System.out.println("Esquerda: " + matriz[l][c-1]);
					} else {
						System.out.println("Esquerda: ");
					}
					
					if (c < matriz.length-1) {
						System.out.println("Direita: " + matriz[l][c+1]);
					} else {
						System.out.println("Direita: ");
					}
				}
			}
		}
		
		sc.close();
	}

}
