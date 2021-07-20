
import java.util.Scanner;
public class Array_Entradadedados {
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner (System.in);
		
		//variaveis
		int n = 10;
		
		//declarado vetor
		int vetor [] = new int [n];
		int i;
		
		
		
		//entrada de dados
		for(i=0; i<n;i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
			
			vetor[i] = ler.nextInt();
		}
		
		
		//calculando valores
		
		
		
		
		int soma= 0;
		int menor =vetor[0];
		int maior = vetor[0];
		
		for(i = 0; i<n;i++) {
			soma+=vetor[i];
			
			if(vetor[i]>maior) 
				maior = vetor[i];
		
				if(vetor[i]<menor)
					menor = vetor[i];
					
			
				
				
				
				
				
			}
		
		
		
		
		//saida de dados
		System.out.printf("\n");
	    for (i=0; i<n; i++) {
	      if (vetor[i] == menor)
	        System.out.printf("v[%d] = %2d <--- menor valor\n", i, vetor[i]);
	      else if (vetor[i] == maior)
	              System.out.printf("v[%d] = %2d <--- maior valor\n", i, vetor[i]);
	           else System.out.printf("v[%d] = %2d\n", i, vetor[i]);
			
		}
		
	    System.out.printf("\nSoma = %d\n", soma);
		
		
	}
}


