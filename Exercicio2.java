package IntroducaoJava;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner (System.in);
		int anos, meses, dias; 
		
		System.out.print("Digite a sua idade em dias: ");
		dias = leia.nextInt();
		
		leia.close(); 
		
		anos = dias/365;
		meses = dias/31;
		
		System.out.printf("A sua idade em anos é %d",anos);
		System.out.printf("A sua idade em dias é %d", meses);
		System.out.printf("A sua idade em dias é %d", dias);
		
		
		
	}

}