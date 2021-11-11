package LacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main (String args[]) {
		
		
		
		Scanner x = new Scanner (System.in);
		int p=0, i=0, numb;
		
		
		System.out.print ("Digite um valor: ");
		numb = x.nextInt();
		
		
		for (int n=0; n<10; n++) {
			
			if (numb%2 == 0) {
				p++;
			}
			
			else if (numb%2 !=0) {
				i++;
					
			}	
			
			System.out.print("Digite um valor: ");
			numb = x.nextInt();
			
		}	
			x.close(); 
		 
			System.out.printf("O total de números pares é de %d",p);
			System.out.printf(" e o total de números impares é de %d",i);
	}
}