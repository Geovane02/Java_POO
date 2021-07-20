
public class Caneta {
	//atributos
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	//método construtor = tudo aquilo que ja vem marcado de fábrica - exemplo canete cor azul
	
	public Caneta(String m, String c, float p) {//método contrutor, é o que tem o mesmo nome da classe
		this.setModelo (m);
		this.setCor (c);
		this.setPonta (p);
		this.tampar();
		
		
	}
	public String getModelo() {//acessar atributo modelo
		return this.modelo;
	}
	public void setModelo(String m) {//modificar atributo modelo
		this.modelo=m;
	}
	public float getPonta() { //pegar ou acessar atributo ponta
		return ponta;
	}
	public void setPonta(float p) {//modificar atributo ponta
		this.ponta = p;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	
	public void status () {
		System.out.println("SOBRE A CANETA");
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+this.getPonta());
		
		System.out.println("Cor: "+this.getCor());
		System.out.println("Tampar: "+this.tampada);
		
	}
}
