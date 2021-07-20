
public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caneta c1 = new Caneta("NIC","VERMELHA",0.5f);
		c1.setModelo("BIC"); //método acessor
		c1.setPonta(0.5f); //método acessor
		
		//c1.status();
		
		System.out.println("Tenho uma caneta "+c1.getModelo()+" do tamanho da ponta "+c1.getPonta());
		System.out.println("");
		
		
		Caneta c2 = new Caneta("NIC","VERMELHA",0.5f);
		c2.setModelo("Compactor");
		c2.setPonta(0.7f);
		//c2.destampar();
		c2.status();
		
		
		
		Caneta c3 = new Caneta("NIC","VERMELHA",0.5f); //passando os parametros do método contrutor caneta.
		c3.status();
	}

}
