package Aula12_Polimorfismo;

public class Peixe extends Animal {

	private String corScama;
	
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo substancia");
	}
	@Override
	public void emitirSom() {
		System.out.println("peixe não faz som");
	}
	
	public void soltarBolha() {
		System.out.println(" Bolha -o -o - o - BLU BLU");
	}
	
	
	public String getCorScama() {
		return corScama;
	}
	public void setCorScama(String corScama) {
		this.corScama = corScama;
	}
	
	
	
}
