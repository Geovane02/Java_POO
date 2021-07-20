package Aula10_Heranca;

public class Professor extends Pessoa{

	
	private String especialidade;
	private float salario;
	
	public void receberAumento(float aum) {
		this.salario += aum;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getSalario() {
		return salario;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
