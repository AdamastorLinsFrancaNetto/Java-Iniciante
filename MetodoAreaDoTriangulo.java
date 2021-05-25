package exercicios;

import java.util.Scanner;

public class MetodoAreaDoTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC, xArea, yArea;
		
		System.out.println("Informe as medidas tri�ngulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Informe as medidas tri�ngulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		System.out.println();
		
		xArea = areaTriangulo(xA, xB, xC);
		yArea = areaTriangulo(yA, yB, yC);
		
		mostraAreaTriangulo(xArea, "X");
		mostraAreaTriangulo(yArea, "Y");
		
		mostrarTrianguloMaior(xArea, "X", yArea, "Y");
		
		sc.close();
	}
	
	public static double areaTriangulo(double x, double y, double z) {
		double p = (x + y + z) / 2.0;
		return Math.sqrt(p * (p - x) * (p - y) * (p - z));
	}
	
	public static void mostraAreaTriangulo(double areaTriangulo, String nomeTriangulo) {
		System.out.printf("�rea do tri�ngulo %s �: %.2f%n", nomeTriangulo, areaTriangulo);;
	}
	
	public static void mostrarTrianguloMaior(double areaTriangulo1, String nomeTriangulo1,
			double areaTriangulo2, String nomeTriangulo2) {
		if (areaTriangulo1 > areaTriangulo2) {
			System.out.printf("O tri�ngulo com maior �rea �: %s%n", nomeTriangulo1);
		} else if (areaTriangulo2 > areaTriangulo1) {
			System.out.printf("O tri�ngulo com maior �rea �: %s%n", nomeTriangulo2);
		} else {
			System.out.printf("Os tri�ngulos %s e %s tem a mesma �rea!%n", nomeTriangulo1, 
					nomeTriangulo2);
		}
	}
}
