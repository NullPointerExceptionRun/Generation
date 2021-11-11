package LacoRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String args []) {
		
		Scanner n = new Scanner (System.in);
		int idade, sexo, x, t=0, a=0, b=0, c=0, d=0, e=0, f=0; 
		
		
		
		while (t<150) {
			
			System.out.print ("Digite a sua idade: ");
			idade = n.nextInt();
			System.out.print ("Digite o seu sexo (1 - feminino, 2- masculino e 3 - outro): ");
			sexo = n.nextInt();
			System.out.print("Digite se você é calmo (1), nervoso (2) ou  agressivo (3): "); 
			x = n.nextInt();
			t++;
					
			if (x==1) {
				a++;
			}
			else if ((sexo == 1) && (x==2)) {
				b++;
			}
			else if ((sexo==2) && (x==3)) {
				c++;	
			}
			else if ((sexo==3) && (x==1)){
				d++;
			}	
			else if ((x==2) && (idade >= 40)) {
				e++;
			}
			else if ((x==1) && (idade <=18)) {
				f++;
				
			}
		}
		
		    n.close();
			System.out.printf("Número de pessoas calmas: %d",a);
			System.out.printf("\nNúmero de mulheres nervosas: %d",b);
			System.out.printf("\nNúmero de homens agressivos: %d",c);
			System.out.printf("\nNúmero de outros calmos: %d",d);
			System.out.printf("\nNúmero de pessoas nervosas com mais de 40 anos: %d",e);
			System.out.printf("\nNúmero de pessoas calmas com menos de 18 anos: %d",f);
		
		
	}

}