package IntroducaoJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in); 
		int segundos, duracao, minutos, horas; 
		
		System.out.print("Qual o tempo de duração do evento? ");
		segundos = leia.nextInt(); 
		leia.close(); 
		
		horas = segundos/3600;
		minutos = segundos%3600/60;
		duracao = segundos&3600%60;
				
		System.out.printf ("A duração do evento em horas foi de %d", horas);
		System.out.printf ("h, %d", minutos);
		System.out.printf (" minutos, e %d", duracao);
		System.out.printf (" segundos");
	}
}