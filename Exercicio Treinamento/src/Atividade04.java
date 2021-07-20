import java.util.Scanner;

public class Atividade04 {
	
	public static void main(String[] args) {
		
		int patinho = 0;
		int contagem = 0;
		int valor = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o numero de Patinhos");	
		patinho = in.nextInt();
		
		contagem = patinho;
		valor = patinho;
		while (contagem >=1) {
		
			
			
		System.out.println(patinho+"  patinhos foram passear");			
		System.out.println(" além das montanhas para brincar");				
		System.out.println(" A mamãe gritou: QUÁ, QUÁ, QUÁ, QUÁ");
		System.out.println("Só "+ (--contagem) +" voltaram de lá");
		System.out.println("");
		patinho-=1;
		}
		
		
		System.out.println("A mamãe patinha foi procurar");
		System.out.println("Além das montanhas");
		System.out.println("Na beira do mar");
		System.out.println("A mamãe gritou: Quá, quá, quá, quá");
		System.out.println(valor+" patinhos voltaram de lá.");
		}
		
		
		
	}


