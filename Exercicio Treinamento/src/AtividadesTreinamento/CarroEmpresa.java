package AtividadesTreinamento;

public class CarroEmpresa extends Automovel implements CambioAutomatico{
	
	
	
	
	

	@Override
	public void cambioAutomatico() {
		System.out.println("Carro de empresa possui cambio autom�tico");
		
	}

	@Override
	public void quantidadeMarchas() {
		System.out.println("possui 8 marchas");
	
		
	}

	
	
}
