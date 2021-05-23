package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class NotasMediaArrayFor {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Quantas notas quer adicionar? ");
		int qnt = input.nextInt();
		
		double[] notas = new double [qnt];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(i+1 + "ª Nota: ");
			notas[i] = input.nextDouble();
		}
		System.out.println("Notas digitadas: " + Arrays.toString(notas));
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.println("\nA média das notas foi: " + media);
		input.close();
	}

}
