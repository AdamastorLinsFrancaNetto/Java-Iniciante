package exercicios;

import java.util.Scanner;

public class MetodoEstaticoCirculo {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÍRCULO:");
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume (double raio) {
		return 4.0 * PI * Math.pow(raio, 3) / 3;	
	}

}
