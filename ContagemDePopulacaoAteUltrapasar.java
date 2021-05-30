package exercicios;

public class ContagemDePopulacaoAteUltrapasar {
	
	public static void main(String[] args) {
		
		//Supondo que a popula��o de um pa�s A seja 80000 habitantes com uma taxa anual de crescimento de 3% e que a popula��o de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
		//Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.
		
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
			System.out.printf("Pa�s A: %.1f", paisA);
			System.out.printf("\nPa�s B: %.1f\n", paisB);
		}
		System.out.printf("\nAp�s %.0f anos a polula��o do Pa�s A ultrapassou a do Pa�s B.", anos);
	}

}
