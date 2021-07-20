package Heranca2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Novo imovel1=new Novo();
		
		imovel1.setEndereco("Avenida Brasil");
		imovel1.setPreco(150000.30);
		
		imovel1.adicional(5000);
		
		
		
		Velho imovel2 = new Velho();
		imovel2.setEndereco("Jetulio Vargas");
		imovel2.setPreco(100000);
		imovel2.desconto(7000);
		

	}

}
