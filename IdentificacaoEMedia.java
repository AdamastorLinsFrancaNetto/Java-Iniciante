package exerciciosjava;

import java.util.Scanner;

public class IdentificacaoEMedia {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas
		// por um aluno nas 3 verificações e a média dos exercícios que fazem parte da
		// avaliação, e calcule a média de aproveitamento.

		Scanner input = new Scanner(System.in);

		int adamastor = 202111151;
		int joao = 202111152;
		int maria = 202111153;
		int matricula = 0;

		System.out.println("======== INSERIR NOTAS ========\n");

		while (matricula != adamastor && matricula != joao && matricula != maria) {
			System.out.print("Informe a matrícula do aluno: ");
			matricula = input.nextInt();
			if (matricula == adamastor) {
				System.out.println("\nAluno: ADAMASTOR\n");
				matricula = adamastor;
			} else if (matricula == joao) {
				System.out.println("\nAluno: JOÃO\n");
				matricula = joao;
			} else if (matricula == maria) {
				System.out.println("\nAluna: Maria\n");
				matricula = maria;
			} else {
				System.out.println("Matrícula inválida\n");
			}
		}
		System.out.print("Informe a 1ª nota: ");
		double n1 = input.nextDouble();
		System.out.print("Informe a 2ª nota: ");
		double n2 = input.nextDouble();
		System.out.print("Informe a 3ª nota: ");
		double n3 = input.nextDouble();
		System.out.print("Informe a nota dos execícios: ");
		double nex = input.nextDouble();
		
		double media = (n1+(n2*2)+(n3*3)+nex)/7;
		
		if (media >= 9) {
			System.out.printf("\nA média de aproveitamento foi %.1f que corresponde a 'A'", media);
		} else if (media >= 7 && media < 9) {
			System.out.printf("\nA média de aproveitamento foi %.1f que corresponde a 'B'", media);
		} else if (media >= 5 && media < 7) {
			System.out.printf("\nA média de aproveitamento foi %.1f que corresponde a 'C'", media);
		} else if (media >= 3 && media < 5) {
			System.out.printf("\nA média de aproveitamento foi %.1f que corresponde a 'D'", media);
		} else {
			System.out.printf("\nA média de aproveitamento foi %.1f que corresponde a 'E'", media);
		}
		
		input.close();

	}

}
