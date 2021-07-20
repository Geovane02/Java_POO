package AtividadesTreinamento;

public class CarroPasseio extends Automovel implements CambioManual {
	
	private String tipocambio;
	private String tipoCombustivel;
	
	
	public void tipoCombustivel(String combustivel) {
		if ((combustivel == "gasolina") || (combustivel=="alcool")) {
		System.out.println(" carro é flex, pois utiliza "+combustivel);
	}if (combustivel == "disel") {
		System.out.println("Carro não é flex, pois utiliza "+combustivel);
	}
	
	}


	@Override
	public void cambio() {
		System.out.println("Possui Cambio Manual");
		
	}


	@Override
	public void quantidadeMarchas() {
	System.out.println("possui Cambio de 6 marchas");
		
	}


	

}
