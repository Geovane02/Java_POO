package Heranca2;

public class Velho extends Imovel{
	
	
	
	
	
	
	public void desconto(double valorDesconto) {
		this.setPreco(this.getPreco()-valorDesconto);
		System.out.println("Valor do imovel com o desconto "+this.getPreco());
	}

	
	
	
	
	

}
