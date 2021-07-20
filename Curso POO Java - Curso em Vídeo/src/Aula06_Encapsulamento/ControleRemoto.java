package Aula06_Encapsulamento;

public class ControleRemoto implements Controlador{
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//método construtor
	public void ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		
	}
	
	
	
	//métodos Especiais
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	// métodos abstratos
	
	public void ligar() {
		this.setLigado(true);
	}
	
	
	public void abrirMenu() {
		System.out.println("Está ligado: "+this.getLigado());
		System.out.println("Está tocando: "+ this.getTocando());
		System.out.println("volume: "+getVolume());
		
		for (int i =0; i < this.getVolume();i+=10) {
			System.out.println("[]");
		}
		
		
	}
	public void fecharMenu() {
		System.out.println("Fechando menu");
	}
	public void maisVolume() {
		if(getLigado ()==true) {
			setVolume(getVolume() +1);
		}else {
			System.out.println("Tv desligado");
		}
	}
	public void menosVolume() {
		if(this.getLigado()==true) {
		this.setVolume(this.getVolume()-1);
		}else {
			System.out.println("Tv desligado");
		}
	}
	
	
	public void desligarMudo() {
		if(this.getLigado()==true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	public void play() {
		if(this.getLigado() && ! (this.getTocando())) {
			this.setTocando(true);
		}
	}
	
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}



	@Override
	public void deligar() {
		this.setLigado(false);
		
	}



	@Override
	public void ligarMudo() {
		if(this.getLigado()==true && this.getVolume() > 0) {
			this.setVolume(10);
		}
		
	}
	

}
