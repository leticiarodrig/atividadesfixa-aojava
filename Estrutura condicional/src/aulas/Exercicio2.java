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
		 
		 System.out.print("Entre com o primeiro n�mero");
		 n1 = leia.nextInt();
		 System.out.print("Entre com o segundo n�mero ");
		n2 = leia.nextInt();
		 System.out.print("Entre com o segundo n�mero ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("O maior numero �:",+ n1);
		}
	else if (n2 > n3) {
		System.out.printf("O maior numero �: ",+ n2);
	}else {
		System.out.println("O  maior numero �: " + n3);
		
		}
		
		leia.close();
	}


}
