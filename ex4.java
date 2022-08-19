import java.util.Scanner;


public class ex4 {
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as notas do bimestre:");
		
		int media, n1, n2, n3, n4;
		
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		n4 = entrada.nextInt();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("Sua media foi: " + media);
		
	}
}