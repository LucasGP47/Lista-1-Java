import java.util.Scanner;


public class ex5 {
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os metros:");
		
		float m, c;
		
		m = entrada.nextFloat();
		
		c = m * 100;
		
		System.out.println("O numero em centimetros: " + c);
		
	}
}