package LacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String args[]) {
		
		Scanner n = new Scanner (System.in);
		int idade, total1=0, total2=0; 
		
		System.out.printf("Digite a sua idade: ");
		idade = n.nextInt();
		
			while (idade > -99) {
				if (idade < 21) {
				total1++;
				}
				else if (idade > 50) {
				total2++;
				}
			System.out.printf("Digite a sua idade: ");
			idade = n.nextInt();
			
		}
			
			n.close();
			System.out.printf("Total de pessoas com menos de 21 anos: %d ",total1); 
			System.out.printf(" e o total de pessoas com mais de 50 anos: %d" ,total2);
		
	}

}