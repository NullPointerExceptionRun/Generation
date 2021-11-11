package IntroducaoJava;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		float custCons, custFab, distribuidor, impostos;
		
		System.out.print("Digite o custo de fábrica: ");
		custFab = leia.nextFloat();
		leia.close(); 
		
		distribuidor= (float) 0.28;
		impostos = (float) 0.45;
		custCons = custFab + (custFab* distribuidor) + (custFab*impostos);
		
		
		System.out.printf("O custo do consumidor será de %d", custCons);
		
		
		
		
	}

}