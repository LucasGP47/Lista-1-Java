import java.util.Scanner;

public class ex11 {

     public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		
		float h, p = 0; 
		
		h = entrada.nextFloat();
		p = (float) (72.7 * h - 58);
       
        
        System.out.println("Seu peso ideal e " + p);
	
	
	
        }	
}
