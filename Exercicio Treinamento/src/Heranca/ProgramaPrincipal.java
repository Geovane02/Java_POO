package Heranca;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Atendente f1 = new Atendente();
		
		
		f1.setNome("Maria Fernada");
		f1.setCpf("0985333");
		f1.setIdade(21);
		f1.setSexo("f");
		f1.setSalario(2000.0);
		f1.fazerAniversario();
		f1.atender();
		f1.desligar();
		
		
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getIdade());
		System.out.println(f1.getSexo());
		System.out.println(f1.getSalario());
		System.out.println(f1.bonus());
		System.out.println(f1.isTelefone());
	
		
		
		
		Gerente g =new Gerente();
		g.setNome("Junhor");
		
		g.setCpf("0085737485");
		g.setIdade(37);
		g.setSexo("m");
		g.setSalario(10000.0);
		g.fazerAniversario();
		g.registrarSenha(12345);
		
		boolean autentica = g.autentica(12345);
		
		
		
		System.out.println(g.getNome());
		System.out.println(g.getCpf());
		System.out.println(g.getIdade());
		System.out.println(g.getSexo());
		System.out.println(g.getSalario());
		System.out.println(g.bonus());
		System.out.println(autentica);
		

	}

}
