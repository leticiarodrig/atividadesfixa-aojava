package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double[]nota = new double [4];
		double media = 0.0;
		
		for (int i = 0; i < nota.length; i++) {
			System.out.printf("Entre com a nota: ");
			nota[i]= sc.nextDouble();
		}
		
		media  = (nota[0]+ nota[1]+ nota[2] + nota [3]) / nota.length;
		
		System.out.printf("A media foi %.2f",media);
		
		
	sc.close();	
	}

}
