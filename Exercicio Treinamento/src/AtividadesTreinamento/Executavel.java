package AtividadesTreinamento;

public class Executavel {

	public static void main(String[] args) {
		
		CarroPasseio c1=new CarroPasseio();
		c1.setChassis("SJ234J6L0001");
		c1.setCor("Vermelho");
		c1.tipoCombustivel("gasolina");
		c1.cambio();
		c1.quantidadeMarchas();
		
		System.out.println(c1.getCor());
		System.out.println(c1.getChassis());
		
		System.out.println("====================================");
		System.out.println("");
		
		
		CarroEmpresa c2=new CarroEmpresa();
		c2.setChassis("346m7k20");
		System.out.println(c2.getChassis());
		c2.setLugares(4);
		System.out.println(c2.getLugares());
		
		c2.cambioAutomatico();
		c2.quantidadeMarchas();

	}

}
