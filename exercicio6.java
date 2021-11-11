public class Exercicio6 {
	
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		float x1, x2, y1, y2, d;
		
		System.out.print("Digite o valor de X1: ");
		x1= leia.nextFloat();
		
		System.out.print("Digite o valor de X2: ");
		x2 = leia.nextFloat();
		
		System.out.print("Digite o valor de Y1: ");
		y1 = leia.nextFloat();
		
		System.out.print("Digite o valor de Y2: ");
		y2 = leia.nextFloat();
		leia.close(); 
		
		d= (float) ((float) Math.pow((x2+x1), 2) + Math.pow((y2+y1), 2));
		
		System.out.print(d);
	}

}class exercicio6 {
    
}
