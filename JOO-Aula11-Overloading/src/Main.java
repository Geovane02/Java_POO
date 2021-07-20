class Sobrecarga{
	void imprime1(String s) {
		System.out.println(s);
	}
	void imprime2(String s1, String s2) {
		System.out.println(s1+" - "+s2);
	}
	void imprime3(String s1+" - "+int i1) {
		System.out.println(s1+" - "+i1);
	}
	
	
}



public class Main {
	public static void main(String[] args) {
		
		new Sobrecarga().imprime1("Parâmetro tipo String");
		new Sobrecarga().imprime2("Primeiro parâmetro", "segundo parâmetro");
		new Sobrecarga().imprime3(s);
		
	}

}
