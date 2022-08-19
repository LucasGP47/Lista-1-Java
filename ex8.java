import java.util.Scanner;


public class ex8 {
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe quanto ganha por hora: ");
		
		float h, n, sal; 
		
		h = entrada.nextFloat();
		
		System.out.println("Agora informe quantas horas trabalhou esse mes: ");
	
        n = entrada.nextFloat();
        
        sal = h * n;
        
        System.out.println("Seu salario foi: " + sal);
	
	
	}
}