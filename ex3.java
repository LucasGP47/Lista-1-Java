import java.util.Scanner;


public class ex3 {
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe dois numeros: ");
		
		int soma, n1, n2;
		
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		
		
		soma = n1 +  n2;
		
		System.out.println("A soma foi: " + soma);
		
		
	}
}
