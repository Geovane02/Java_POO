package Aula10_Heranca;

public class ProjetoPessoa {

	public static void main(String[] args) {
		
	
	Pessoa p1 = new Pessoa();
	
	Aluno p2 = new Aluno();
	
	Professor p3 = new Professor();
	
	Funcionario p4 = new Funcionario();
	
	
	p1.setNome("Julieta Marcondes");
	p2.setNome("Marcos Ribeiro");
	p3.setNome("Geovane Novak");
	p4.setNome("Joana Skrepka");
	
	p1.setIdade(22);
	p2.setIdade(29);
	p3.setIdade(30);
	p4.setIdade(60);
	
	p1.setSexo("F");
	p2.setSexo("M");
	p3.setSexo("M");
	p4.setSexo("F");
	
	p2.setCurso("Ingles");
	p3.setSalario(2500.75f);
	p4.setTrabalhando(true);
	p4.setSetor("estoque");
	
	p3.receberAumento(550.20f);
	
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
	System.out.println(p4.toString());
	System.out.println("Salario do professor é de "+p3.getSalario());
	
	
	
	}
	
}
