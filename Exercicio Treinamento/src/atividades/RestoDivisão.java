package atividades;

import java.util.Scanner;

public class RestoDivisão {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		double num1;
		double num2;
		
		System.out.println("Digite o primeiro valor?");
		num1= in.nextDouble();
		
		System.out.println("Digite o segundo valor?");
		num2 = in.nextDouble();
		
		double res = num1 / num2;
		double resto = num1 % num2;
		System.out.println(num1 + " dividido por " + num2 + " = " + res);
		System.out.println("O resto da divisao e: " + resto);

	}

}
