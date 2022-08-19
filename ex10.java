import java.util.Scanner;


public class ex10 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe 2 numeros inteiros e um real");
		
		int n1, n2;
		float r;
		double p, s, c;
		
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		r = entrada.nextFloat();
		
		p = (n1 * 2) * (n2 / 2);
		
		s = (n1 * 3) + r;
		
		c = (r * r * r);
		
		System.out.println("o produto e: " + p);
		
		System.out.println("a soma e: " + s);
		
		System.out.println("o cubo e: " + c);
		
		
		
		
		
		
		
	}
}