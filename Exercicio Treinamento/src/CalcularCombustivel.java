import java.util.Scanner;

public class CalcularCombustivel {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double quantidadePercorrida = 0;
		double consumo = 0;
		double media = 0;
		double preco = 0;
		
		
		System.out.println("Calcular m�dia de combustivel");
		System.out.println("");
		System.out.println("Digite a  Quantidade Km Percorrida");
		quantidadePercorrida = in.nextDouble();
		System.out.println("Digite o Consumo de litros de Combustivel");
		consumo = in.nextDouble();
		System.out.println("Digite o pre�o Combustivel");
		preco = in.nextDouble();
		
		media = (quantidadePercorrida/consumo);
		
		preco = media * preco;
		System.out.println("Custo da viagem �: "+preco);
		
		if (media >=15) {
			System.out.println("Carro economico, fez a m�dia de "+media);
		}else {
			System.out.println("Carro beber�o, fez a m�dia de "+media);
		}
	}

}
