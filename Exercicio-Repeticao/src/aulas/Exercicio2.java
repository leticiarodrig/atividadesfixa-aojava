package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fa�a
		um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha
		igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a pedir as
		informa��es.*/
		
		Scanner leia = new Scanner (System.in).useLocale(Locale.US);
		
		String senhaSalva= "123nayara";
		String usuarioSalvo = "nayara";
		
		System.out.println("Entre com o nome do usu�rio:");
		usuarioSalvo=leia.nextLine();
		
		System.out.println("Entre com a senha:");
		senhaSalva=leia.nextLine();
		
	while (senhaSalva.equals(senhaSalva)) {
		System.out.println("nome de usuario e senha n�o podem ser iguais!DIGITE NOVAMENTE");
		break;
		
		
	}	 
	leia.close();
		
	
		
		
		
		
		
		
		
	}

}
