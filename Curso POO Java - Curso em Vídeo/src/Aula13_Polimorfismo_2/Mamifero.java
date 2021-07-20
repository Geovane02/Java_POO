package Aula13_Polimorfismo_2;

public class Mamifero extends Animal {

	protected String corPelo;

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de Mamifero");
	}
	
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
	
}
