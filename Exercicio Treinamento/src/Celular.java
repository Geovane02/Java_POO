
public class Celular {

	public String cor;
	public float android;
	public int quantidadeCamera;
	public float cameraPrincipal;
	public int bateria;
	
	
	//método contrutor
	public Celular(String cor, float android, int quantidadeCamera, float cameraPrincipal, int bateria) {
		this.setCor (cor);
		this.setAndroid (android);
		this.setQuantidadeCamera (quantidadeCamera);
		this.setCameraPrincipal(cameraPrincipal);
		this.setBateria (bateria);
		
	}
	
	
	//get e set
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getAndroid() {
		return android;
	}
	public void setAndroid(float android) {
		this.android = android;
	}
	
	public int getQuantidadeCamera() {
		return quantidadeCamera;
	}
	public void setQuantidadeCamera(int quantidadeCamera) {
		this.quantidadeCamera = quantidadeCamera;
	}
	public float getCameraPrincipal() {
		return cameraPrincipal;
	}
	public void setCameraPrincipal(float cameraPrincipal) {
		this.cameraPrincipal = cameraPrincipal;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	
	
	public void status() {
		System.out.println("DADOS SOBRE O CELULAR");
		
		System.out.println("cor do celular: "+this.getCor());
		System.out.println("Versão do Android: "+this.getAndroid());
		System.out.println("Quantidade de cameras:"+this.getQuantidadeCamera());
		System.out.println("Resolução camera principal PX:"+this.getCameraPrincipal());
		System.out.println("bateria: "+this.getBateria());
	}
}
