package Aula06_Encapsulamento;

public interface Controlador {

	//m�todo Abistrato = � previsto mais n�o implementado.
	public abstract void ligar ();
	public abstract void deligar ();
	public abstract void abrirMenu ();
	public abstract void fecharMenu ();
	public abstract void maisVolume ();
	public abstract void menosVolume ();
	public abstract void ligarMudo ();
	public abstract void desligarMudo ();
	public abstract void play ();
	public abstract void pause ();
	
	
}
