package exercicios;

import java.util.Scanner;

public class VerificarSeTaDentroIntervalo {

	public static void main(String[] args) {
		
		// Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		// Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
		// essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de n�meros: ");
		int n = sc.nextInt();
		int x;
		int in = 0;
		int out = 0;

		for (int i = 1; i <= n; i++) {
			System.out.printf("Informe o %d�: ", i);
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.printf("%nIntervalo [10,20]%n");
		System.out.println("in: " + in);
		System.out.println("out: " + out);
		
		sc.close();
	}

}
