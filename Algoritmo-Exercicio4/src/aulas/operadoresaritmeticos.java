package aulas;

import java.util.Locale;
import java.util.Scanner;

public class operadoresaritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in).useLocale(Locale.US);
		
		int a;
		int b;
	
		
		System.out.println("Insira um n�mero inteiro");
		a = leia.nextInt();
		
		System.out.println("Insira mais um n�mero inteiro");
		b = leia.nextInt();
		
		System.out.println("A soma de a e b �:" + (a + b));
		
		
	}

}
