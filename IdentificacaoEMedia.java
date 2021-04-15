package exerciciosjava;

import java.util.Scanner;

public class IdentificacaoEMedia {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia o n�mero de identifica��o, as 3 notas obtidas
		// por um aluno nas 3 verifica��es e a m�dia dos exerc�cios que fazem parte da
		// avalia��o, e calcule a m�dia de aproveitamento.

		Scanner input = new Scanner(System.in);

		int adamastor = 202111151;
		int joao = 202111152;
		int maria = 202111153;
		int matricula = 0;

		System.out.println("======== INSERIR NOTAS ========\n");

		while (matricula != adamastor && matricula != joao && matricula != maria) {
			System.out.print("Informe a matr�cula do aluno: ");
			matricula = input.nextInt();
			if (matricula == adamastor) {
				System.out.println("\nAluno: ADAMASTOR\n");
				matricula = adamastor;
			} else if (matricula == joao) {
				System.out.println("\nAluno: JO�O\n");
				matricula = joao;
			} else if (matricula == maria) {
				System.out.println("\nAluna: Maria\n");
				matricula = maria;
			} else {
				System.out.println("Matr�cula inv�lida\n");
			}
		}
		System.out.print("Informe a 1� nota: ");
		double n1 = input.nextDouble();
		System.out.print("Informe a 2� nota: ");
		double n2 = input.nextDouble();
		System.out.print("Informe a 3� nota: ");
		double n3 = input.nextDouble();
		System.out.print("Informe a nota dos exec�cios: ");
		double nex = input.nextDouble();
		
		double media = (n1+(n2*2)+(n3*3)+nex)/7;
		
		if (media >= 9) {
			System.out.printf("\nA m�dia de aproveitamento foi %.1f que corresponde a 'A'", media);
		} else if (media >= 7 && media < 9) {
			System.out.printf("\nA m�dia de aproveitamento foi %.1f que corresponde a 'B'", media);
		} else if (media >= 5 && media < 7) {
			System.out.printf("\nA m�dia de aproveitamento foi %.1f que corresponde a 'C'", media);
		} else if (media >= 3 && media < 5) {
			System.out.printf("\nA m�dia de aproveitamento foi %.1f que corresponde a 'D'", media);
		} else {
			System.out.printf("\nA m�dia de aproveitamento foi %.1f que corresponde a 'E'", media);
		}
		
		input.close();

	}

}
