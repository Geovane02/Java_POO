package Aula05;

public class ContaBanco {
	//atributos
	public int numeroConta;
	protected String tipoConta;
	private String donoConta;
	private double saldo;
	private boolean status;
	
	//m�todo contrutor
	
	public ContaBanco(){
		this.saldo = 0;
		this.status = false;
		
	}
	
	
	public void estadoAtual() {
		System.out.println("--------------------------------------");
		System.out.println("Conta: "+this.getNumeroConta());
		System.out.println("Tipo de Conta: "+this.getTipoConta());
		System.out.println("Dono da Conta: "+this.getDonoConta());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
		System.out.println("");
	}	
		
	//metodos especiais
	public void abrirConta(String tipoConta) {
		this.setTipoConta (tipoConta);
		this.setStatus (true);
		
		if (this.getTipoConta () == "Conta Corrente") {
			this.setSaldo (50);
		}else {
			if(getTipoConta () == "Conta Poupan�a") {
				this.setSaldo (150);
			}
		}
		
	}
	
	public void fecharConta () {
		if(this.getSaldo() > 0) {
			System.out.println("N�o posso fechar a conta, tem saldo no  valor de "+this.getSaldo());
		}
		if(this.getSaldo() < 0) {
			System.out.println("Sua conta est� em d�bito no valor de "+this.getSaldo());
		}
		if(this.getSaldo()==0) {
		this.setStatus(false);
			System.out.println("Conta fechado");
		}
	}
	
	
	public void depositarConta(double valor) {
		if(this.getStatus() != false) {
			//saldo = saldo + valor;
			this.setSaldo(this.getSaldo()+valor);
			System.out.println("Dep�sito realiado com sucesso.");
			System.out.println("Dep�sito realiado na conta de ."+this.getDonoConta());
			System.out.println("Seu saldo no banco � "+this.getSaldo());
		}
		if(this.getStatus() != true) {
			System.out.println("Ipossivel fazer o dep�sito");
		}
		
		
		
	}
	
	
	public void sacarValor(double valor) {
		if(this.getStatus() != false) {
			if(this.getSaldo()>=valor) {
				this.setSaldo(this.getSaldo()-valor);
				System.out.println("Saque realizado com socesso. novo saldo "+this.getSaldo());
			}else {
				System.out.println("saldo insuficiente");
				System.out.println("seu saldo � apenas "+this.getSaldo());
			}
			
		}
		if( this.getStatus()!= true) {
			System.out.println("impossivel Sacar");
		}
	}
			
		
	
	public void pagarMensalidade() {
		int v= 0;
		if (this.getTipoConta()=="Conta Corrente") {
			v=12;
		}else if (this.getTipoConta() == "Conta Poupan�a") {
			v=20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo()-v);
				System.out.println("Mensalidade pago com sucesso!");
			}
			
		}
		
		
	
	
	
	//get e set

	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getDonoConta() {
		return donoConta;
	}
	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return status;
	
	
		
	}
		
			
	
	}
	
	
	

