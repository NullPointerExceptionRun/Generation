package LacoCondicional;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		int idade; 
		
		System.out.print("Digite sua idade: "); 
		idade = leia.nextInt();
		leia.close();
		
		if ((idade >=10) && (idade <=14)) {
			System.out.print("Categoria: Infantil");
		} 
		else if ((idade >=15) && (idade <=17)) {
			System.out.print("Categoria: Juvenil");
		}
		
		else if  ((idade >=18) && (idade <=25)) {
			System.out.print("Categoria: Adulto");
		}
		else 
			System.out.print("Idade não permitida!");
	}

}