public class Exercicio5 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		float nota1, nota2, nota3, peso1=3, peso2=2, peso3=5, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
				
		System.out.print("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
				
		System.out.print("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		leia.close(); 

		
		media = (float) ((nota1*peso1)+(nota2*peso2)+(nota3+peso3))/(peso1+peso2+peso3);
		
		System.out.print(media);
	}

}class exercicio5 {
    
}
