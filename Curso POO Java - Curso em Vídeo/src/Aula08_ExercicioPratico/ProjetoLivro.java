package Aula08_ExercicioPratico;

public class ProjetoLivro {
public static void main(String[] args) {
	
	//vetor
	Pessoa[] p = new Pessoa [2];
	Livro [] l = new Livro [3];
	
	p[0] = new Pessoa("Pedro",22,"M");
	p[1] = new Pessoa ("Maria", 25,"F");
	
	
	l[0] = new Livro ("Aprendendo Java", "José da Silva", 300, p[0]);
	l[1] = new Livro ("POO para iniciantes", "Pedro Paulo", 400,p[1]);
	l[2] = new Livro ("Java Avançado","Maria Candido",800, p[0]);
	
	
	l[0].abrir();
	l[0].folhear(50);
	l[0].avancarPagina();
	l[0].avancarPagina();
	l[0].folhear(70);
	l[0].avancarPagina();
	l[0].avancarPagina();
	l[0].avancarPagina();
	//l[0].folhear(350);
	
	
	l[1].abrir();
	l[1].avancarPagina();
	l[1].fechar();
	
	
	
	System.out.println(l[0].detlhes());
	System.out.println(l[1].detlhes());
	
	
	
}
	
	
}
