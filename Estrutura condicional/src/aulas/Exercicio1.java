package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Fa�a:
um programa que leia dois n�meros e imprima o maior deles;*/
		
		Scanner leia =new Scanner(System.in).useLocale(Locale.US);
		 int n1 = 0;
		 int n2 = 0;
		 
		 System.out.print("Entre com o primeiro n�mero");
		 n1 = leia.nextInt();
		 System.out.print("Entre com o segundo n�mero ");
		n2 = leia.nextInt();
		
		if (n1 > n2) {
			System.out.printf("Numero %d � o maior", n1);
		}
	else {
		System.out.printf("Numero %d � o maior",n2);
		
		}
		
		leia.close();
	}

}
