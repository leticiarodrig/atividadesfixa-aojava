package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Scanner leia =new Scanner(System.in).useLocale(Locale.US);
	
	int opcao = 0
	
    System.out.println("Digite um valor de 1 a 7:");
    opcao=leia.nextInt();

 switch (opcao) {
     case 1:
         System.out.println("Domingo");
         break;
     case 2:
         System.out.println("Segunda-Feira");
         break;
     case 3:
         System.out.println("Terça-Feira");
         break;
     case 4:
         System.out.println("Quarta-feira");
         break;
     case 5:
         System.out.println("Quinta-Feira");
         break;
     case 6:
         System.out.println("Sexta-Feira");
         break;
     case 7:
         System.out.println("Sábado");
         break;
     default:
         System.out.println("Este não é um dia válido");
 }   
}
}
	
	
	
	
	
	
	
	
	
	

