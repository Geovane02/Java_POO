package Aula12_Polimorfismo;

public class Repitil extends Animal{

	private String corEscama;
	
	
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo vejetais");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de r�ptil");
	}
	
	
	
	
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
