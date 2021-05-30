package exercicios;

public class ContagemDePopulacaoAteUltrapasar {
	
	public static void main(String[] args) {
		
		//Supondo que a população de um país A seja 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
		//Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
		
		double paisA = 80000;
		double taxaA= 3;
		double paisB = 200000;
		double taxaB = 1.5;
		double anos = 0;
		
		while (paisA <= paisB) {
			anos++;
			paisA = ((taxaA/100)*paisA)+paisA;
			paisB = ((taxaB/100)*paisB)+paisB;
			System.out.println("Ano: " + anos);
			System.out.printf("País A: %.1f", paisA);
			System.out.printf("\nPaís B: %.1f\n", paisB);
		}
		System.out.printf("\nApós %.0f anos a polulação do País A ultrapassou a do País B.", anos);
	}

}
