package Aula13_Polimorfismo_2;

public class Aula13 {
public static void main(String[] args) {
	

	
	
	Cachorro c = new Cachorro();
	
	c.setCorPelo("Preto");
	c.emitirSom();
	System.out.println(c.getCorPelo());
	
	c.reagir(true);
	c.reagir("vá para casa");
	c.reagir(5, 12);
	c.reagir(12, 15);
}	
}
