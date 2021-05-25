package exercicios;

import java.util.Scanner;

public class AreaDoTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC, xArea, yArea, p;
		
		System.out.println("Informe as medidas triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Informe as medidas triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		System.out.println();
		
		p = (xA + xB + xC) / 2;
		xArea = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2;
		yArea = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Área triângulo X: %.2f%n", xArea);
		System.out.printf("Área triângulo Y: %.2f%n", yArea);
		
		if (xArea > yArea) {
			System.out.println("Maior é: Triângulo X");
		} else if (yArea > xArea){
			System.out.println("Maior é: Triângulo Y");
		} else {
			System.out.println("Os triângulos X e Y tem a mesma área!");
		}
		
		sc.close();
	}

}
