package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
	
   Scanner leia = new Scanner (System.in).useLocale(Locale.US);
   
   int nota=0;
   
   System.out.println("Insira uma nota v�lida");
   nota = leia.nextInt();
   
   do {
	    System.out.println("nota v�lida!");
	    nota ++;
	   
	    }while ( nota > 10);
         System.out.println("nota inv�lida!");
	   nota ++;
	   
   leia.close();
	}
}


	


