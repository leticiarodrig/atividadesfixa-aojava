package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Faça:
um programa que leia dois números e imprima o maior deles;*/
		
		Scanner leia =new Scanner(System.in).useLocale(Locale.US);
		 int n1 = 0;
		 int n2 = 0;
		 
		 System.out.print("Entre com o primeiro número");
		 n1 = leia.nextInt();
		 System.out.print("Entre com o segundo número ");
		n2 = leia.nextInt();
		
		if (n1 > n2) {
			System.out.printf("Numero %d é o maior", n1);
		}
	else {
		System.out.printf("Numero %d é o maior",n2);
		
		}
		
		leia.close();
	}

}
