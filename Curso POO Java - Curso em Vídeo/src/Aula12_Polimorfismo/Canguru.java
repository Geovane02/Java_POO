package Aula12_Polimorfismo;

public class Canguru extends Mamifero{

	
	//sobrepondo o locomover correndo para pulando utilizando o mesmo m�todo locomover()
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}
	
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}
	
}
