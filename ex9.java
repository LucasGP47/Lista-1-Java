import java.util.Scanner;


public class ex9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit: ");
		
		float t, c;
		
		t = entrada.nextFloat();
		
		c = (5 * (t - 32) / 9);
		
		System.out.println("A temperatura em celsius e: " + c);
		
		
		
		
	}
}