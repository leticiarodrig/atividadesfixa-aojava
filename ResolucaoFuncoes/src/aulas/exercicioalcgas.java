package aulas;

import java.util.Locale;
import java.util.Scanner;

public class exercicioalcgas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);	
		
			double alcool = 0.0;
			double gasolina = 0.0;
			
			System.out.print("Informe o valor do alcool: ");
			alcool = sc.nextDouble();
			System.out.println("Informe o valor da gasolina: ");
			gasolina = sc.nextDouble();
			
			GasOuAlc(alcool,gasolina);
			
			sc.close();
			
	}
	public static  void GasOuAlc(double a, double g) {
		if(a / g >= 0.70) {
			System.out.println("Compensa abastecer com gasolina!");
		}else {
			System.out.println("Compensa abastecer com alcool!");
		
		}
	}
}
