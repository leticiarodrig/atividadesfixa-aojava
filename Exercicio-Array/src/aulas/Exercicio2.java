package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		
		int[]idade = new int[5];
		double[] altura = new double[5];
		
		{
		for (int i = 0; i < idade.length;i++);
		System.out.println("Entre com a idade:");
		idade[i]= sc.nextInt();
		
		System.out.println("Entre com a altura:");
		altura[i]= sc.nextDouble();
		
	    }
		{
		for(int i = 0; i < idade.length; i++) {
		System.out.println("idade: " +idade[i]);
		System.out.println("altura:" + altura [i]);
		}
	}	
		sc.close();
	}

}
