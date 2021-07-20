import java.util.Scanner;

public class Multiplo_Sete {
public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	
	int n = 0;
	int resultado = 0;
	int mult =7;
	System.out.println("digite a quantidade de valores multiplos de 7");
	n = in.nextInt();
	
	
	for (int i = 0; i <=n; i++) {
		
		 resultado = mult * i;
		 System.out.println("7 * "+i+" = "+resultado);
		
		
	}
	
	
	
}
}
