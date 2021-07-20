package AlarmeResidencial;

public class UsuarioAlarme {
public static void main(String[] args) {
	
	
	Alarme usuario;
	usuario = new Alarme();
	
	
	usuario.criarSenhaUsuario(98765);
	
	usuario.ativarAlarme(98765);
	usuario.ativarConfiguracao(123);
	
	//usuario.diminurVolume(45);
	//usuario.diminurVolume(volume);
	usuario.desativarConfiguração(123);
	
	usuario.ativarConfiguracao(123);

	usuario.desativarConfiguração(123);
	
	usuario.desativarAlarme(98765);
	
	
	usuario.AtivarSencores();
	usuario.desativarSencores();
	usuario.desativarSencores();
	usuario.desativarSencores();
	usuario.desativarSencores();
	usuario.desativarSencores();
	usuario.desativarSencores();
	usuario.desativarSencores();
	
	usuario.aumentarVolume();
	usuario.diminurVolume();
	usuario.diminurVolume();
	usuario.diminurVolume();
	usuario.diminurVolume();
	usuario.diminurVolume();
	usuario.diminurVolume();
	usuario.diminurVolume();
	
	//usuario.ativarConfiguracao(123);
	usuario.diminurVolume();
	usuario.aumentarVolume();
	usuario.AtivarSencores();
	usuario.AtivarSencores();
	usuario.AtivarSencores();
	usuario.AtivarSencores();
	//usuario.desativarConfiguração(123);
	usuario.ativarAlarme(98765);
	usuario.desativarAlarme(9895);
	usuario.ativarConfiguracao(123);
	usuario.AtivarSencores();
	
	
	
	
	
	usuario.estadoAtual();
	
	
	
}
}
