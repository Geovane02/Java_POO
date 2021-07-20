class Retangulo{ //nome da classe
	public int width, height; //variaveis
	
	
	public int areaTotal() { // cria um método chamado area total
	//criando corpo da função
		return width * height; //retorna o valor da multiplicação
		
	}
	
		public boolean isQuadrado() {
			if(width == height)
				return true;
			return false;
		}
}
public class Main {
public static void main(String[] args) {
	
	Retangulo quadrado;
	quadrado = new Retangulo();
	quadrado.height = 100;
	quadrado.width = 120;
	System.out.println("A medida do retangulo é: "+quadrado.areaTotal());
	System.out.println("As medidas do retangulo são iguais? "+quadrado.isQuadrado());
	
}
}
