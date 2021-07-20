
public class CadastroCelular {
public static void main(String[] args) {
	
	Celular celular1;
	celular1 = new Celular("Branco", 10.2f, 3, 25.0f, 3500);
	celular1.status();
	
	System.out.println("-----------------------------");
	
	Celular celular2;
	celular2 = new Celular("Branco", 10.2f, 3, 25.0f, 3500);
	celular2.setCor("Preto");
	celular2.setAndroid(11.0f);
	celular2.setQuantidadeCamera(4);
	celular2.setCameraPrincipal(48.4f);
	celular2.setBateria(5000);
	
	System.out.println("cor do celular: "+celular2.getCor());
	System.out.println("Versão do Android: "+celular2.getAndroid());
	System.out.println("Quantidade de cameras:"+celular2.getQuantidadeCamera());
	System.out.println("Resolução camera principal PX:"+celular2.getCameraPrincipal());
	System.out.println("bateria: "+celular2.getBateria());
	
	
}
}
