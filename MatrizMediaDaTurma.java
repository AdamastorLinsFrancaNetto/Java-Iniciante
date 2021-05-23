package exercicios;

import java.util.Scanner;

public class MatrizMediaDaTurma {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = input.nextInt();
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = input.nextInt();
		System.out.println();
		
		double[][] notasDaTurma = new double [qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for(int a = 0; a < notasDaTurma.length; a++) {
			for(int n = 0; n < notasDaTurma[a].length; n++) { 
				System.out.printf("Informe a %dª nota do aluno %d: ", n+1, a+1);
				double nota = input.nextDouble();
				total += nota;
			}
		System.out.println("");
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.printf("A média de notas da turma foi: %.1f", media);
		
		input.close();
	}
}
