package Heranca;

public class Funcionario {
	//classe Mãe
	
	//atributos
	private String nome;
	private int idade;
	private String sexo;
	private String cpf;
	protected double salario;
	protected double bonificacao;
	
	
	//metodos adicionais
	
	
	public double bonus() {
		return this.salario*0.5;
	}
	
	public void fazerAniversario() {
		this.setIdade(this.getIdade()+1);
	
	}
	
	
	
	//métodos abstratos
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	

}
