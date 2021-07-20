import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int valor = 0;
		double num1, num2, num3, num4, soma, media;
		
		num1 =  num2 = num3 = num4 = soma = media = 0;
		Scanner in = new Scanner (System.in);
		
		
		
	do {	
		System.out.println("");
		System.out.println("Digite 0 para sair do programa e 1 para continuar");
		valor = in.nextInt();
		if(valor != 0) {
		
		System.out.println("Digite a nota do primeiro bimestre");
		num1 = in.nextDouble();
		System.out.println("Digite a nota do segundo bimestre");
		num2 = in.nextDouble();
		System.out.println("Digite a nota do terceiro bimestre");
		num3 = in.nextDouble();
		System.out.println("Digite a nota do quarto bimestre");
		num4 = in.nextDouble();
		
		
				
		soma=num1+num2+num3+num4;
		media = soma/4;
		
			if (media>=6) {
				System.out.println("Aluno Aprovado, sua média é "+media);
			}else {
				System.out.println("Aluno Reprovado sua média é "+media);
			}
		
			
	
		}else {
			System.out.println("Programa desativado");
		}
	
	
	}while(valor != 0);
}
}
