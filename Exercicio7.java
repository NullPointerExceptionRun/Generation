package IntroducaoJava;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String args []) {
		
		Scanner leia = new Scanner (System.in);
		int A,B,C,D,E,F,X,Y;
		
		System.out.print("Digite um valor para A: ");
		A= leia.nextInt();
		
		System.out.print("Digite um valor para B: ");
		B=leia.nextInt();
		
		System.out.print("Digite um valor para C: ");
		C=leia.nextInt();
		
		System.out.print("Digite um valor para D: ");
		D=leia.nextInt();
		
		System.out.print("Digite um valor para E: ");
		E= leia.nextInt();
		
		System.out.print("Digite um valor para F: ");
		F= leia.nextInt();
		leia.close(); 
		
		
		X= ((C+B)-(B+F))/((A+B)-(B+D));
		Y= ((A+F)-(C+D))/((A+E)-(B+D));
		
		System.out.printf("O valor de x é %d ",X);
		System.out.printf("e valor de Y é %d ", Y);
	}
	

}