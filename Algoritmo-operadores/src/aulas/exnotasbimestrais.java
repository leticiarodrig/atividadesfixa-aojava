package aulas;

import java.util.Locale;
import java.util.Scanner;

public class exnotasbimestrais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in).useLocale(Locale.US);
		
		double pribimestre = 0.00;
		double segbimestre = 0.00;
		double terbimestre = 0.00;
		double quarbimestre = 0.00;
		double mediafinal = 0.00;
		
		System.out.print("Insira a nota do PRIMEIRO bimestre: ");
		pribimestre = leia.nextDouble();
		
		System.out.print("Insira a nota do SEGUNDO bimestre: ");
		segbimestre = leia.nextDouble();
		
		System.out.print("Insira a nota do TERCEIRObimestre: ");
		terbimestre = leia.nextDouble();
		
		System.out.print("Insira a nota do QUARTO bimestre: ");
		quarbimestre = leia.nextDouble();
		
		mediafinal =(pribimestre + segbimestre + terbimestre + quarbimestre)/4;
	
		System.out.print("A media final é de: " + mediafinal + " pontos.");
		
		
		

		
		
	}
	}


