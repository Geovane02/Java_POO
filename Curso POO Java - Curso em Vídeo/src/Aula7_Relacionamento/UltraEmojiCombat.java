package Aula7_Relacionamento;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//vetor
		Lutador l[] = new Lutador [6];
				
		l[0] = new Lutador ("Pretty Boy","Fran�a", 31, 1.75f, 68.9f, 11,2,1);
		l[1] = new Lutador ("Putscript","Brasil", 29, 1.68f, 57.8f, 14,2,3);
		l[2] = new Lutador ("Snepshadow","EUA", 35, 1.65f, 80.9f, 12,2,1);
		l[3] = new Lutador ("Dead Code","Australia", 28, 1.93f, 81.6f, 13,0,2);
		l[4] = new Lutador ("OFOCobol","Brasil", 37, 1.70f, 119.3f, 5,4,3);
		l[5] = new Lutador ("Nerdart","EUA", 30, 1.81f, 105.7f, 12,2,4);
		
		//l[3].perderLuta();
		//l[3].empatar();
		//l[3].apresentar();		
		//l[3].status();

		//Luta UEC01 = new Luta();
		//UEC01.marcarLuta(l[0], l[1]);
		//UEC01.lutar();
		//l[0].status();
		Luta UEC02 = new Luta();
		UEC02.marcarLuta(l[2], l[3]);
		UEC02.lutar();
		l[2].apresentar();



	}

}
