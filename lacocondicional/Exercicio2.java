package LacoCondicional;

import java.util.Scanner;

public class Exercicio2 {
	
	
	public static void main (String args []) {
		
		
		Scanner leia = new Scanner (System.in);
		int numb1, numb2, numb3;
		
		System.out.print("Digite o primeiro valor: ");
		numb1 = leia.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numb2 = leia.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		numb3 = leia.nextInt();
		
		leia.close(); 
			
		
		if ((numb1 < numb2) && (numb2 < numb3)) {
			System.out.print(numb1);
			System.out.print(numb2);
			System.out.print(numb3);
		}
		else if ((numb2 < numb1) && (numb1 < numb3)){
			System.out.print(numb2);
			System.out.print(numb1);
			System.out.print(numb3);
			
		}
		else if ((numb3 < numb2) && (numb2 < numb1)) {
			System.out.print(numb3);
			System.out.print(numb2);
			System.out.print(numb1);
		}
		else if ((numb2 < numb3) && (numb3 < numb1)){
			System.out.print(numb2);
			System.out.print(numb3);
			System.out.print(numb1);
		}
		
	}
	
}