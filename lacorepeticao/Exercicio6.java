package LacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String args []) {
		
		Scanner n = new Scanner (System.in);
		int x, soma=0;
		
	
		 do {
			System.out.print("Digite um valor no teclado: ");
			x = n.nextInt(); 
			soma += x;
		 } while (x != 0);
	
		n.close();
		System.out.printf("A soma dos números digitados é %d",soma);
		
	}
			
}