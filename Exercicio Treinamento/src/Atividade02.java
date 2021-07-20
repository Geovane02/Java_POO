

import java.util.Scanner;
public class Atividade02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int maior = 0;
		int quantidade = 1;
		
		while (quantidade <=10) {
			
			System.out.println("Digite o numero - Quantidade " + quantidade);
			int numero =in.nextInt();
			
			if (numero > maior) {
				maior = numero;
			}
			quantidade++;
			
			
			
			
		}
		
		System.out.println("O valor Maior é "+ maior);
		
	}
	
	
}
