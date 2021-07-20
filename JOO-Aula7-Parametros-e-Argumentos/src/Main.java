class Calculo{
	void soma(int num1, int num2) {
		
		System.out.println(num1 + num2);
		
		//método soma recebe  parametros (num1, num2)
		
	}
}


public class Main {
	public static void main(String[] args) {
		
		Calculo calculo;
		calculo = new Calculo();
		calculo.soma(5, 25);
		//System.out.println(calculo.soma);
	}

}
