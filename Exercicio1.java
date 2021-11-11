package IntroducaoJava;

import java.util.Scanner;

public class Exercicio1 {


	public static void main(String args[]) {
	
		Scanner leia = new Scanner (System.in);
		int anos, meses, dias, total; 
		
		System.out.print("Digite a sua idade em anos: ");
		anos = leia.nextInt();
		
		System.out.print("Digite a sua idade em meses: ");
		meses = leia.nextInt();
		
		System.out.print("Digite a sua idade em dias: ");
		dias = leia.nextInt();
		
		leia.close(); 
		
		total = anos*365 + meses*31 + dias;
		
		System.out.printf("A sua idade em dias é %d",total);
	}

}