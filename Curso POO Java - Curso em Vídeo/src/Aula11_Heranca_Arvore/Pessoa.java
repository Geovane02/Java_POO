package Aula11_Heranca_Arvore;

public abstract class Pessoa {
	//é uma classe abstrata
	
	private String nome;
	private int idade;
	private String sexo;
	
	
	public void fazerAneversario() {
		
		this.idade++;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pessoa{"+"nome = "+nome+", idade = "+idade+", sexo = "+sexo+"}";
	}
	

}
