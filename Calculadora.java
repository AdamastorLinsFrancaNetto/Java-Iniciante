package exercicios;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		//Implemente um script Python que consista em uma calculadora b�sica de quatro opera��es (soma, subtra��o, multiplica��o e divis�o)
		
		Scanner input = new Scanner(System.in);
		
		String sn = "s";
		
		while(!sn.equalsIgnoreCase("n") &&
				!sn.equalsIgnoreCase("nao") &&
				!sn.equalsIgnoreCase("n�o")) {
			
			System.out.print("\nN�mero:  ");
			double n1 = input.nextDouble();
			
			System.out.print("+ - * /: ");
			String op = input.next(); 
			
			System.out.print("N�mero:  ");
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
				System.out.println("Opera��o inv�lida!");
			}
			
			do {
				System.out.print("\nDeseja fazer outra opera��o [S/N] ? ");
				sn = input.next();
			} while (!sn.equalsIgnoreCase("s") && 
					!sn.equalsIgnoreCase("sim") &&
					!sn.equalsIgnoreCase("n") &&
					!sn.equalsIgnoreCase("n�o") &&
					!sn.equalsIgnoreCase("nao"));	
		}
		System.out.println("\nFIM DA OPERA��O !!!");
		input.close();
	}

}
