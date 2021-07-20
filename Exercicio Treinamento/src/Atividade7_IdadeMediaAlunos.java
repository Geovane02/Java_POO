
import java.util.Scanner;

public class Atividade7_IdadeMediaAlunos {
	public static void main(String[] args) {
		
		//Calcule a Idade Média de 10 alunos.
		
		Scanner in = new Scanner (System.in);
		
		int idade, soma, media;
		idade = soma = 0;
		media = 0;
		
		for(int i = 1; i<=10;i++) {
		System.out.println("Digite a "+i+" idade:");
		idade=in.nextInt();
		
		soma+=idade;
		
		
		
		
		}
		media = soma/10;
		System.out.println("O resultado da idade média dos alunos: "+media);
		
		
		
	}

}
