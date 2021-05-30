package exercicios;

import java.util.Scanner;

public class CadastroLoginSenha {
	
	public static void main(String[] args) {
		
		//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Crie seu login: ");
		String login = input.nextLine();
		System.out.print("Crie sua senha: ");
		String senha = input.nextLine();
		while (senha.equalsIgnoreCase(login)) {
			System.out.println("ERRO!!! Informe uma senha diferente do login!");
			System.out.print("Crie sua senha: ");
			senha = input.nextLine();
		}
		System.out.println("\nLogin e senha cadastrados com sucesso!\n");
		System.out.println("Informe login e senha para ter acesso ao sistema.");
		System.out.print("Login: ");
		String loginAcesso = input.nextLine();
		System.out.print("Senha: ");
		String senhaAcesso = input.nextLine();
		while (!loginAcesso.equals(login) || !senhaAcesso.equals(senha)) {
			System.out.println("\nLogin ou senha incorretos!");
			System.out.print("Login: ");
			loginAcesso = input.nextLine();
			System.out.print("Senha: ");
			senhaAcesso = input.nextLine();
		}
		System.out.println("\nSEJA BEM VINDO!!!");	

		input.close();
	}

}
