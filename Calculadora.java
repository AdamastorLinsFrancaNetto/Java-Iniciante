package exercicios;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		//Implemente um script Python que consista em uma calculadora básica de quatro operações (soma, subtração, multiplicação e divisão)
		
		Scanner input = new Scanner(System.in);
		
		String sn = "s";
		
		while(!sn.equalsIgnoreCase("n") &&
				!sn.equalsIgnoreCase("nao") &&
				!sn.equalsIgnoreCase("não")) {
			
			System.out.print("\nNúmero:  ");
			double n1 = input.nextDouble();
			
			System.out.print("+ - * /: ");
			String op = input.next(); 
			
			System.out.print("Número:  ");
			double n2 = input.nextDouble();
			
			if (op.equals("+")) {
				System.out.printf("\n%.1f + %.1f = %.1f\n", n1, n2, n1+n2);
			} else if (op.equals("-")) {
				System.out.printf("\n%.1f - %.1f = %.1f\n", n1, n2, n1-n2);
			} else if (op.equals("*")) {
				System.out.printf("\n%.1f * %.1f = %.1f\n", n1, n2, n1*n2);
			} else if (op.equals("/")) {
				System.out.printf("\n%.1f / %.1f = %.1f\n", n1, n2, n1/n2);
			} else {
				System.out.println("Operação inválida!");
			}
			
			do {
				System.out.print("\nDeseja fazer outra operação [S/N] ? ");
				sn = input.next();
			} while (!sn.equalsIgnoreCase("s") && 
					!sn.equalsIgnoreCase("sim") &&
					!sn.equalsIgnoreCase("n") &&
					!sn.equalsIgnoreCase("não") &&
					!sn.equalsIgnoreCase("nao"));	
		}
		System.out.println("\nFIM DA OPERAÇÃO !!!");
		input.close();
	}

}
