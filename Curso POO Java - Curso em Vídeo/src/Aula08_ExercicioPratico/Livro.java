package Aula08_ExercicioPratico;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public String detlhes() {
	return "Livro{"+ "Titulo = "+titulo+"| autor = "+autor+" \n| total de p�ginas = "
	+totPaginas+" | p�gina atual = "+pagAtual+" \n| aberto = "+aberto+" |leitor = "+leitor.getNome()+" | idade = "+leitor.getIdade()+
	" | sexo = "+leitor.getSexo()+"}";		
	}
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
				//int pagAtual, boolean aberto
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.aberto = true;
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.aberto = false;
		if(this.aberto != true) {
			this.pagAtual = 0;
		}
	}

	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if(p>this.totPaginas) {
			this.pagAtual = 0;
		}else {
		this.pagAtual = p;
		}
	}

	@Override
	public void avancarPagina() {
		// TODO Auto-generated method stub
		this.pagAtual ++;
	}

	@Override
	public void voltarPaginas() {
		// TODO Auto-generated method stub
		this.pagAtual --;
	}

}
