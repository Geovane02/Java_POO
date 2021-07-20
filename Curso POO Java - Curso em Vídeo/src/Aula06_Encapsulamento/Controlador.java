package Aula06_Encapsulamento;

public interface Controlador {

	//método Abistrato = É previsto mais não implementado.
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
