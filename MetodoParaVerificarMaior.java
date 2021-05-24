package exercicios;

import java.util.Scanner;

public class MetodoParaVerificarMaior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 3 valores inteiros: ");
		System.out.print("1º: ");
		int a = sc.nextInt();
		System.out.print("2º: ");
		int b = sc.nextInt();
		System.out.print("3º: ");
		int c = sc.nextInt();

		int higher = verificarMaior(a, b, c);
		mostrarResultado(higher);

		sc.close();

	}

	public static int verificarMaior(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void mostrarResultado(int value) {
		System.out.println("O maior valor é: " + value);
	}

}