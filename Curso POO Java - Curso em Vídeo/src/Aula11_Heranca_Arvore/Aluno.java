package Aula11_Heranca_Arvore;

public class Aluno extends Pessoa{
	
	private int matricula;
	private String curso;
	
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno "+this.getNome());
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	

}
