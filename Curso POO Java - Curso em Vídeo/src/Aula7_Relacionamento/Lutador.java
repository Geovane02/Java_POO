package Aula7_Relacionamento;



public class Lutador {
	//Tributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria, derrotas, empates;
	
	
	
	
	//Método publico
	public void apresentar() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" CHEGOU A HORA DE APRESENTAR O LUTADOR "+this.getNome());
		System.out.println(" DIRETAMENTE DE "+this.getNacionalidade());
		System.out.println(" COM "+this.getIdade()+" ANOS E "+this.getAltura()+" METROS DE ALTURA.");
		System.out.println("PESANDO "+this.getPeso()+" Kg");
		System.out.println(this.getVitoria()+" VITÓRIAS.");		
		System.out.println(this.getDerrotas()+" DERROTAS");
		System.out.println(this.getEmpates()+" EMPATES.");
		System.out.println("");
	}
	
	public void status() {
		System.out.println(this.getNome()+ " É UM "+this.getCategoria());
		System.out.println("GANHOU "+this.getVitoria()+" VEZES.");
		System.out.println("PERDEU "+this.getDerrotas()+" VEZES.");
		System.out.println("EMPATOU "+this.getEmpates()+" VEZES.");
		
	}
	
	public void ganharLuta() {
		this.setVitoria(this.getVitoria() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatar() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	//Métodos especiais
	public Lutador(String no, String na, int id, float al, float pe, int vi,int de,  int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso (pe);
		this.vitoria = vi;
		this.derrotas = de;		
		this.empates = em;
			
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getVitoria() {
		return vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = " INVALIDO ";
		}else if(this.peso <= 70.3) {
			this.categoria = " PESO LEVE.";
			}else if(this.peso <= 83.9) {
				this.categoria = " PESO MÉDIO ";
			}else if (this.peso <= 120.2) {
				this.categoria = " PESO PESADO ";
			}else{
				this.categoria = " INVALIDO ";
				
			}
		
		
	}
	
	
	
	

}
