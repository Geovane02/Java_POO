class Retangulo{ //nome da classe
	public int width, height; //variaveis
	
	
	public int areaTotal() { // cria um m�todo chamado area total
	//criando corpo da fun��o
		return width * height; //retorna o valor da multiplica��o
		
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
	System.out.println("A medida do retangulo �: "+quadrado.areaTotal());
	System.out.println("As medidas do retangulo s�o iguais? "+quadrado.isQuadrado());
	
}
}
