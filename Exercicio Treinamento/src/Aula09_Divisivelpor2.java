import java.util.Scanner;

public class Aula09_Divisivelpor2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		
		//Repita por 6x a entrada de 2 valores e efetue a soma.
		//mostre se a soma é divisivel por 2, se sim multiplique por 4, senão multiplique por 3
		
		
		int i = 0;
		double soma = 0;
		double mult = 0;
		do {
			
			System.out.println("");
			System.out.println("----------------------------------------");
		System.out.println("Digite o primeiro valor");
		double valor1 = in.nextDouble();
		
		System.out.println("Digite o primeiro valor");
		double valor2 = in.nextDouble();
		
	
		soma = valor1 + valor2;
		
		if(soma%2==0) {
			mult=soma*4;
			System.out.println("O resultado da Multiplicação por 4 é: "+mult);
		}
			else {
				mult=soma*3;
				System.out.println("O resultado da Multiplicação por 3 é: "+mult);
			
		}
		
		}while(i<6);i++;
		
		
		
	}
}
