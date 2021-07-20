
public class Aula5 {
	
	public static void main(String[] args) {
		
		ContaBanco primeiroCadastro;
		primeiroCadastro = new ContaBanco();
		
		primeiroCadastro.abrirConta("Conta Corrente");
		primeiroCadastro.setTipoConta("Conta Corrente");
		primeiroCadastro.setNumeroConta(123456789);
		primeiroCadastro.setDonoConta("Jubileu");
		//primeiroCadastro.setSaldo();
		primeiroCadastro.estadoAtual();
		primeiroCadastro.depositarConta(150);
		primeiroCadastro.sacarValor(100);
		primeiroCadastro.sacarValor(10);
		//primeiroCadastro.pagarMensalidade(12);
		primeiroCadastro.estadoAtual();
		
		
		ContaBanco segundoCadastro;
		segundoCadastro = new ContaBanco();
		
		segundoCadastro.abrirConta("Conta Poupança");
		segundoCadastro.setTipoConta("Conta Corrente");
		segundoCadastro.setDonoConta("Julieta");
		segundoCadastro.setNumeroConta(876543219);
		segundoCadastro.sacarValor(150);
		//segundoCadastro.fecharConta();
		
		segundoCadastro.depositarConta(300);
		segundoCadastro.sacarValor(100);
		//segundoCadastro.pagarMensalidade(20);
		segundoCadastro.fecharConta();
		segundoCadastro.sacarValor(200);
		segundoCadastro.fecharConta();
		
		segundoCadastro.estadoAtual();
		
		
		
	}
	

}
