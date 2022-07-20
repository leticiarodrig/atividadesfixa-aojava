package aulas;

import java.util.Locale;
import java.util.Scanner;

public class valorhora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça
	um Programa que pergunte quanto você ganha por hora e o número de horas
	trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/
		
		Scanner leia = new Scanner (System.in).useLocale(Locale.US);
		
		double valorporhora = 0.00;
		double horastrabalhadas = 0.00;
		double salario = 0.00;
		
		System.out.println("Insira o valor da sua hora trabalhada");
		valorporhora= leia.nextDouble();
		
		System.out.println("Insira quantas horas vc trabalha durante o mês");
		horastrabalhadas= leia.nextDouble();
		
		salario = (valorporhora * horastrabalhadas);
		
		System.out.println("Seu salário nesse mês será de:$  "  + salario );
		
	}

}
