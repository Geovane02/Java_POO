package Semafaro;

public class Teste {

	public static void main(String[] args) {
	
		ThreadsSemafaros tt=new ThreadsSemafaros();
		for(int i =0; i< 3; i++) {
			System.out.println(tt.cor);
			
			
			tt.esperaCorMudar();
			
		}

	}

}
