package LacoCondicional;

import java.util.Scanner;

public class Exercicio1 {
	
	
	public static void main (String args []) {
		
		
		Scanner leia = new Scanner (System.in);
		int numb1, numb2, maior, numb3;
		
		System.out.print("Digite o primeiro valor: ");
		numb1 = leia.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numb2 = leia.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		numb3 = leia.nextInt();
		
		leia.close(); 
		
		if ((numb1 > numb2) && (numb1 > numb3)) {
			maior = numb1;
		}
		else if ((numb2 > numb1) && (numb2>numb3)) {
			maior = numb2;
		}
		else {
				maior = numb3;
		}
		
		
		System.out.printf("O maior número digitado foi %d ",maior);
		
			
	}
	
	

}public class Exercicio1 {
    
}
