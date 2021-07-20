package enumeracao.constante;

public class Teste {
	public static void main(String[] args) {
		
		escolherDiaSemana(3);
		imprimerTodoDiaSemana();
		
	}
	
	
	
	
	
	//declarando método
	private static void escolherDiaSemana(int dia) {
		if((dia <= 5) && (dia >=0)){
		
		switch (dia) {
		case 0: {
			System.out.println("Valor inválido");
			}
		break;
		case 1: {
			System.out.println("Segunda feira");
				}
		break;
		case 2: {
			System.out.println("Terça feira");
			}
		break;
		case 3:{
			System.out.println("Quarta feira");
		}	
		break;
		case 4:{
			System.out.println("Quinta Feira");
		}
		break;
		case 5:{
		System.out.println("Sexta Feira");
		}
		break;
		}
		}else if (dia >=6) {
			System.out.println("Dia inválido");
		}
	}
	
	

	
	private static void imprimerTodoDiaSemana() {
		
		int primeiroDia = semana.SEGUNDA;
		int segundoDia = semana.TERCA;
		int terceiroDia = semana.QUARTA;
		int quartoDia = semana.QUINTA;
		int quintoDia = semana.SEXTA;
		System.out.println("");
		imprimir(primeiroDia);	
		imprimir(segundoDia);
		imprimir(terceiroDia);
		imprimir(quartoDia);
		imprimir(quintoDia);
		
		
	}
	
	private static void imprimir(int dia) {
	switch (dia) {
	case 1:
		System.out.println("Segunda - Feira");
		break;
	case 2:
		System.out.println("Terça - Feira");
		break;
	case 3:
		System.out.println("Quarta - Feira");
		break;
	case 4:
		System.out.println("Quinta - Feira");
		break;
	case 5:
		System.out.println("Sexta - Feira");
		break;
	}
	}

}
