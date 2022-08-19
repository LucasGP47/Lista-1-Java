import java.util.Scanner;


public class ex13 {
	
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o peso dos peixes pescados: ");
		
		float p, pesot, m;
		
		p = entrada.nextFloat();
		
		pesot = p - 50;
		
		if (pesot <= 0) {
			m = 0;
			System.out.println("Nao a multa, peso dentro do estabelecido");
		}
		else {
			m = 4 * pesot;
			System.out.println("Devera pagar " + m + " de multa.");
		}
		
		
		
		
		
		
		
}
}
