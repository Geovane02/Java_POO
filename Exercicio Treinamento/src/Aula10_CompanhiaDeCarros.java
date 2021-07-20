import java.util.Scanner;

public class Aula10_CompanhiaDeCarros {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		/*
		 * Uma Companhia de carros paga ao seus empregados um salário de 500 reais por mês,
		 * mais uma comissão de 50 reais para cada carro vendido e mais 5% do valor da venda.
		 * Elabore um algoritimo para calcular e imprimir o salário de um vendedor no dado mês, recebendo como dados
		 * de entrada o nome do vendedor, o numero de carros vendidos e o valor total das vendas
		 */
		
		
		
		
		double salario = 500;
		double comissao = 50;
		double numerodeCarros = 0;
		double percentual = 0.05;
		double valorTotalVendas = 0;
		double resultado = 0;
		
		
		System.out.println("JANEIRO");
		System.out.println("Nome do vendedor");
		String nome = in.next();
		
		System.out.println("numero de carros vendidos");
		numerodeCarros = in.nextDouble();
		System.out.println("Valor total das vendas");
		valorTotalVendas = in.nextDouble();
		
		
		
		System.out.println("Nome do Vendedor: "+nome);
		System.out.println("Salario do vendedor: "+salario);
		
		numerodeCarros*=comissao;
		System.out.println("Comissão: "+numerodeCarros);
		
		
		valorTotalVendas*=percentual;
		System.out.println("Total Porcentagem das vendas: "+valorTotalVendas);
		
		
		resultado=salario+numerodeCarros+valorTotalVendas;
		System.out.println("Total do salário Funcionário: "+resultado);
		
		
		
	
	
	
	
	
	}
}
