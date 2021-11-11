package LacoCondicional;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String args []) {
		
		Scanner leia= new Scanner (System.in); 
		int numero, resp; 
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		leia.close();
		
		if (numero %2 == 0) {
			System.out.print("Esse número é par");
			resp = (int) Math.sqrt(numero);
			System.out.printf(" e a sua raiz quadrada é %d",resp);
		}
		else if (numero %2 != 0) {
			System.out.print("Esse número é impar");
			resp= (int) Math.pow(numero, 2);
			System.out.printf(" e exponencial dele é %d", resp);
			
			
		}
		
		
	}

}