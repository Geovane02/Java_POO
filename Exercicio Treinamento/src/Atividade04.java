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
		System.out.println(" al�m das montanhas para brincar");				
		System.out.println(" A mam�e gritou: QU�, QU�, QU�, QU�");
		System.out.println("S� "+ (--contagem) +" voltaram de l�");
		System.out.println("");
		patinho-=1;
		}
		
		
		System.out.println("A mam�e patinha foi procurar");
		System.out.println("Al�m das montanhas");
		System.out.println("Na beira do mar");
		System.out.println("A mam�e gritou: Qu�, qu�, qu�, qu�");
		System.out.println(valor+" patinhos voltaram de l�.");
		}
		
		
		
	}


