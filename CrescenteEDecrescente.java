package exerciciosjava;

public class CrescenteEDecrescente {
	
	public static void main(String[] args) {
		
		//Implemente um script Java que escreva na tela todos os números de 1 até 50 de forma crescente e depois decrescente.
		
		//whie
		int count = 1;
		while (count <= 50) {
			System.out.print(count + " ");
			count++;
		}
		System.out.println("");
		count = 50;
		while (count >= 1) {
			System.out.print(count + " ");
			count--;
		}
		
		
		//for
		System.out.println("");
		for(int i = 1; i <= 50; i++)
			System.out.print(i + " ");
		System.out.println("");
		for(int j = 50; j >= 1; j--)
			System.out.print(j + " ");
			
	}

}
