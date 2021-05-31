package exercicios;

import java.util.Scanner;

public class DiagonalMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o tamannho da matriz? ");
		int tamanho = sc.nextInt();
		
		int[][] matriz = new int[tamanho][tamanho];
		
		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Linha %d, coluna %d: ", l, c);
				matriz[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("\nMATRIZ:");
		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {	
				System.out.print("[" + matriz[l][c] + "]");
			}
			System.out.println();
		}
		
		int negativos = 0;
		System.out.print("\nNúmeros na primeira diagonal: ");
		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if (l == c) {
					System.out.print("[" + matriz[l][c] + "]");
				}
				if (matriz[l][c] < 0) {
					negativos += 1;
				}
			}
		}
		System.out.println("\nNúmeros negativos = " + negativos);
		
		sc.close();
	}

}
