package aulas;

import java.util.Locale;
import java.util.Scanner;

public class valorhora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fa�a
	um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
	trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.*/
		
		Scanner leia = new Scanner (System.in).useLocale(Locale.US);
		
		double valorporhora = 0.00;
		double horastrabalhadas = 0.00;
		double salario = 0.00;
		
		System.out.println("Insira o valor da sua hora trabalhada");
		valorporhora= leia.nextDouble();
		
		System.out.println("Insira quantas horas vc trabalha durante o m�s");
		horastrabalhadas= leia.nextDouble();
		
		salario = (valorporhora * horastrabalhadas);
		
		System.out.println("Seu sal�rio nesse m�s ser� de:$  "  + salario );
		
	}

}
