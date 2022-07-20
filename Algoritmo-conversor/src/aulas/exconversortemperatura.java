package aulas;

import java.util.Locale;
import java.util.Scanner;

public class exconversortemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Faça
um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a
temperatura em graus Celsius.
•C= 5 * ((F-32) / 9).*/
		
		Scanner leia = new Scanner (System.in).useLocale(Locale.US);
		 double grausfah = 0.00;
		 double celsius = 0.00;
		 
		 System.out.println("Insira a temperatura em graus Fahrenheit: ");
		 grausfah = leia.nextDouble();
		 
		celsius = 5.0 * (grausfah-32.0) / 9.0 ;
				 
		System.out.println("A temperatura em graus Celsius é de: " + celsius);
		
		
		
		
	}

}
