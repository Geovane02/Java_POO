package AlarmeResidencial;

public class Alarme {
	private int senhaUsuario;
	private boolean ativacaoAlarme;
	private boolean alarmeLigado;
	private int senhaConfiguracao;
	private boolean ativacaoConfiguracao;
	private int sensor;
	private int quantidadeSensor;
	private int volume;
	private int totalVolume;
	

	public  Alarme () {
		
		
	//	this.alarmeLigado = false;
		this.senhaConfiguracao = 123;
		this.ativacaoConfiguracao = true;
		this.volume = 10;
		this.sensor = 6;
	}
	

	
	
	
	
	
	
	
	public void criarSenhaUsuario(int senha) {
		
		this.setSenhaUsuario (senha);
		System.out.println("Senha criado com sucesso: "+senhaUsuario);
		
		
		
	}
	
	private void senhaSistema() {
		//this.getSenhaConfiguracao()= senha;
	}
	
	
	
	
	public void ativarAlarme(int senhaAtivar) {
		
		if ((this.getSenhaUsuario()==senhaAtivar)&& (this.quantidadeSensor > 0)){
			this.setAtivacaoAlarme (true);
			System.out.println("Alarme Ativado com sucesso: "+this.isAtivacaoAlarme());
			
		}else if(this.getSenhaUsuario() != senhaAtivar){
		System.out.println("Senha Incorreta!");
		}else if(this.quantidadeSensor <=0) {
			System.out.println("Sensores Desativados");
		}
	}
	
	public void desativarAlarme(int senhaDesativar) {
		
		if((this.getSenhaUsuario() == senhaDesativar)&&(this.isAtivacaoAlarme()==true)) {
			this.setAtivacaoAlarme (false);
			
			System.out.println("Alarme desativado com sucesso. "+this.isAtivacaoAlarme() );
			
		}else if(this.isAtivacaoAlarme()!=true){
			System.out.println(("Alarme n�o estava ativado"));
		}
			else if(this.getSenhaUsuario() != senhaDesativar) {
			System.out.println("Senha Incorreta");
		}
	}
	
	public void ativarConfiguracao(int senhaConfi) {
		if (this.getSenhaConfiguracao() == senhaConfi) {
			this.setAtivacaoConfiguracao (true);
			System.out.println("Configura��o ativado. "+this.isAtivacaoConfiguracao());
		}else {
			System.out.println("Senha da Configura��o Incorreta");
		}
		
	}
	
	public void desativarConfigura��o(int senhaConfi){
		if (this.getSenhaConfiguracao() == senhaConfi) {
			this.setAtivacaoConfiguracao(false);
			System.out.println("Acessando configura��o - Configura��o Desativado");
			
				
			
			} else  {
			System.out.println("Senha da comfigura��o incorreta");
		}
	}
	
	public void aumentarVolume() {
		
			
			if(this.isAtivacaoConfiguracao () == false) {
				
				this.totalVolume = this.getVolume();
						if(totalVolume >=10) {
							System.out.println("imposivel Almentar");
				
						}else {
							this.setVolume(this.getVolume()+1);
						}
			}else {
				System.out.println("Configura��o desligado");
			
	}
	}
	
	
	public void diminurVolume() {
		
		if(this.isAtivacaoConfiguracao () == false) {
			this.totalVolume = this.getVolume();
			if(totalVolume <=0) {
				System.out.println("Imposivel Diminur, volume 0");
			}else {
			this.setVolume(this.getVolume()-1);
			}
			}else {
				System.out.println("Configura��o desligado");
			}
	}
	
	
	public void AtivarSencores() {
		if(this.isAtivacaoConfiguracao() == false) {
			this.quantidadeSensor = this.getSensor();
			if(quantidadeSensor >=6) {
				System.out.println("Imposivel ativar. limite 6 sensores ativados");
				
			}else{
			this.setSensor(this.getSensor()+1);	
			
		}
		}
			else {
			System.out.println("Configura��o ativado");
		}
	}
	
	
	
	
	
	public void desativarSencores() {
		if(this.isAtivacaoConfiguracao() == false) {
			this.quantidadeSensor = this.getSensor();
			if(quantidadeSensor==0) {
				System.out.println("Impossivel desativar - limite completado");
			}else {
			this.setSensor(this.getSensor()-1);
		}
		}else {
			System.out.println("Configura��o ativado");
		}
	}
	
	
	
	
	
	
	public void estadoAtual() {
		System.out.println("________Estado Atual________");
		System.out.println("Alarme Usuario = "+this.isAtivacaoAlarme());
		System.out.println(" Configura��o = "+this.isAtivacaoConfiguracao());
		System.out.println("Volume alarme = "+this.getVolume());
		System.out.println("total de sen�ores ativados = "+this.getSensor());
		
	}
	
	//get e set
	public int getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(int senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	public boolean isAtivacaoAlarme() {
		return ativacaoAlarme;
	}
	public void setAtivacaoAlarme(boolean ativacaoAlarme) {
		this.ativacaoAlarme = ativacaoAlarme;
	}
	public int getSenhaConfiguracao() {
		return senhaConfiguracao;
	}
	public void setSenhaConfiguracao(int senhaConfiguracao) {
		this.senhaConfiguracao = senhaConfiguracao;
	}
	
	public boolean isAtivacaoConfiguracao() {
		return ativacaoConfiguracao;
	}
	public void setAtivacaoConfiguracao(boolean ativacaoConfiguracao) {
		this.ativacaoConfiguracao = ativacaoConfiguracao;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isAlarmeLigado() {
		return alarmeLigado;
	}
	public void setAlarmeLigado(boolean alarmeLigado) {
		this.alarmeLigado = alarmeLigado;
	}
	
	public int getSensor() {
		return sensor;
	}
	public void setSensor(int sensor) {
		this.sensor = sensor;
	}
	
	
	
	
	
	
	
	
	
	
	

}
