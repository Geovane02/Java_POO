package Heranca;

public class Gerente extends Funcionario{
	
	
	private int senha;
	
	
	
	public void registrarSenha(int digiteSenha) {
		this.setSenha(digiteSenha);
	}
	
	
	
	public double bonus() {
		return this.salario*0.8;
	}
	
	
	
	
	
	
	public boolean autentica(int senha) {
		if(this.getSenha() == senha) {
			return true;
		}else {
		return false;
		}
	}
	
	
	
	
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	

}
