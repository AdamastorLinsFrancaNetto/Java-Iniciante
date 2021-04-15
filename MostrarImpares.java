package exerciciosjava;

public class MostrarImpares {
	
	public static void main(String[] args) {
		
		//Implemente um script Java para mostrar os 20 primeiros números impares. Faça isso usando while e for.
		
		//while
		int count = 0;
		while (count <= 20) {
			if (count%2 != 0) {
				System.out.print(count + " ");
			}
		count++;	
		}
		System.out.println("");
		
		//for
		for(int i = 1; i <= 20; i+=2)
			System.out.print(i + " ");
				
	}

}
