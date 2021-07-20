
public class MenuPricipalClasseSemRetorno {
public static void main(String[] args) {
	
	
	MetodoSemRetorno v1 = new MetodoSemRetorno()
;
	v1.depositarValores(30.0);
	v1.depositarValores(200.2);
	
	v1.sacar(130);
	v1.sacar(13000);
	
	v1.verificarSaldo();
	
}
}
