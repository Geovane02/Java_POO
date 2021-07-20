
public class MetodoSemRetorno {

	private double saldo;
	protected double resultado;
	
	
	public void depositarValores(double valor) {
		this.setSaldo(this.getSaldo()+valor);
		
	}
	
	public void verificarSaldo() {
		System.out.println("Seu saldo é: "+this.getSaldo());
	}
	
	
	public double sacar(double valorSacar) {
		if (this.getSaldo()>=valorSacar) {
			this.setSaldo(this.getSaldo()-valorSacar);
			
		}else if(this.getSaldo()<valorSacar) {
			System.out.println("valor indisponivel");
						
		}
		
		return saldo;
	}
	
	
	
	
	
	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
		
		
		
		
		
		
		
}
