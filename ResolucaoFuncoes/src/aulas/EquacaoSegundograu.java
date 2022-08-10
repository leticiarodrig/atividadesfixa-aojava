package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EquacaoSegundograu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);	
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		System.out.print("Informe o valor de A: ");
		a = sc.nextDouble();
		System.out.print("Informe o valor de B: ");
		b = sc.nextDouble();
		System.out.print("Informe o valr de C: ");
		c = sc.nextDouble();
		
		
		FsegundoGrau(a,b,c);
		sc.close();
		
	}
	public static void FsegundoGrau(double a,double b, double c) {
		double Delta = (Math.pow(b,2)-(4 * a * c));
		double x1 = 0.0;
		double x2 = 0.0;
		if(Delta < 0) {
			System.out.println("Delta não tem raíz!");
		}else {
			x1 = (-b + Math.sqrt(Delta))/(2 * a);
			x2 = (-b - Math.sqrt(Delta))/(2 * a);
			
		}
		System.out.printf("Delta está valendo %.2f", Delta);
		System.out.printf("\n x1 está valendo %.2f", x1);
		System.out.printf("\n x2 está valendo %.2f", x2);
		
	}
	 
}
	



