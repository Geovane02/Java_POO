package Aula11_Heranca_Arvore;



public class Aula011 {
	public static void main(String[] args) {
		
		//Pessoa n = new Pessoa();
		
		//Pegando os dados da classe pessoa através da classe Visitante(classe pobre)
		Visitante v1 = new Visitante();
		
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		
		
		//pegando os dados da classe ALUNO (classe rica)  e tambem da classe PESSOA
		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setIdade(23);
		a1.setSexo("M");
		a1.fazerAneversario();
		a1.pagarMensalidade();
		
		//System.out.println(a1.toString());
		
		
		Bolsista b2 = new Bolsista();
		
		b2.setNome("Jubileu");
		b2.setIdade(22);
		b2.setSexo("M");
		b2.setMatricula(1234);
		b2.setCurso("Informática");
		b2.fazerAneversario();
		b2.setBolsa(12.5f);
		b2.pagarMensalidade();
		//System.out.println(b2.toString());
		
		
		
		
		
		
	}

}
