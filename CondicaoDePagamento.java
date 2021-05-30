package exercicios;

import java.util.Scanner;

public class CondicaoDePagamento {
	
	public static void main(String[] args) {
		
		//Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
		
		System.out.println("Condição de pagamento"
				+ "\n 1 - À vista em dinheiro ou débito, recebe 15% de desconto"
				+ "\n 2 - Cartão de crédito à vista ou cheque, recebe 10% de desconto"
				+ "\n 3 - Em duas vezes, preço normal de etiqueta sem juros"
				+ "\n 4 - Em mais de duas vezes, preço normal de etiqueta mais juros de 10%");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o preço do produto: R$ ");
		double preco = input.nextDouble();
		
		int condicao = 0;
		
		do {
			System.out.print("Informe a condição de pagamento [1,2,3,4]: ");
			condicao = input.nextInt();
		} while (condicao != 1 && 
				condicao != 2 &&
				condicao != 3 &&
				condicao != 4);
		
		switch (condicao) {
		case 1:
			System.out.printf("\nO valor a ser pago é R$ %.2f", preco*.85);
			break;
		case 2:
			System.out.printf("\nO valor a ser pago é R$ %.2f", preco*.9);
			break;
		case 3:
			System.out.printf("\nO valor a ser pago é R$ %.2f em 2X de %.2f", preco, preco/2);
			break;
		default:
			System.out.printf("\nO valor a ser pago é R$ %.2f em até 10x", preco*1.1);
		}
		input.close();
	}

}