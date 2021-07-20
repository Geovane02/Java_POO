
import java.util.Scanner;
public class Aula6 {
	//Implementar um Algoritimo que lei 3 valores quaisquer e imprima de ordem crescente.
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		
		
		
		
		int a, b, c, x;
		a = b = c =  x = 0;
	
		do {
			System.out.println("");
			System.out.println("Digite o Primeiro valor");
			a  = in.nextInt();
			System.out.println("Digite o Segundo valor");
			b  = in.nextInt();
			System.out.println("Digite o terceiro valor");
			c  = in.nextInt();
			
			if(a<b){
				if(b<c) {
					System.out.println(a+"-"+b+"-"+c);
				}
				else
					if(a<c) {
						System.out.println(a+"-"+c+"-"+b);
					}else
						System.out.println(c+"-"+a+"-"+b);
			}
			else 
				if(b<c) {
					if (a <c) {
						System.out.println(b+"-"+a+"-"+c);
					}else {
						System.out.println(b+"-"+c+"-"+a);
						
					}
	
					
				} else {
					System.out.println(c+"-"+b+"-"+a);
					
			
			
}	
			
					
		
		 
		
		
			
		}
		while(x==0);
		
	}
	
}



