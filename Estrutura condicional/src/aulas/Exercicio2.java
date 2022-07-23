package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =new Scanner(System.in).useLocale(Locale.US);
		 int n1 = 0;
		 int n2 = 0;
		 int n3 = 0;
		 
		 System.out.print("Entre com o primeiro número");
		 n1 = leia.nextInt();
		 System.out.print("Entre com o segundo número ");
		n2 = leia.nextInt();
		 System.out.print("Entre com o segundo número ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("O maior numero é:",+ n1);
		}
	else if (n2 > n3) {
		System.out.printf("O maior numero é: ",+ n2);
	}else {
		System.out.println("O  maior numero é: " + n3);
		
		}
		
		leia.close();
	}


}
