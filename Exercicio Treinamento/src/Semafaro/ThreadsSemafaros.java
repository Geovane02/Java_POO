package Semafaro;

public class ThreadsSemafaros implements Runnable{

	public CoresSemafaro cor;
	private boolean execucao=false;
	private boolean corMudou= false;

	public ThreadsSemafaros() {
		super();
		this.cor = cor.VERMELHO;

		new Thread(this).start();

	}

	@Override
	public void run() {

		while(execucao=true) {
			try {
				switch (cor) {
				case VERMELHO:
					Thread.sleep(6000);				
					break;
				case AMARELO:
					Thread.sleep(800);				
					break;
				case VERDE:
					Thread.sleep(4000);				
					break;

				default:
					break;

				}
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}
	public synchronized void mudarCores() {
		switch (this.cor) {
		case VERMELHO:
			this.cor=CoresSemafaro.VERDE;
			break;
		case VERDE:
			this.cor=CoresSemafaro.AMARELO;
			break;
		case AMARELO:
			this.cor=CoresSemafaro.VERMELHO;
			break;

		default:
			break;
		}
		corMudou=true;
		notify();
	}
	public synchronized void esperaCorMudar() {
		
		try {
			while(!corMudou) {
			
				wait();
			} 
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.corMudou=false;
	}

}
