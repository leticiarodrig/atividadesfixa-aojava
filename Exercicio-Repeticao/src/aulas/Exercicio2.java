package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça
		um programa que leia um nome de usuário e a sua senha e não aceite a senha
		igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
		informações.*/
		
		Scanner leia = new Scanner (System.in).useLocale(Locale.US);
		
		String senhaSalva= "123nayara";
		String usuarioSalvo = "nayara";
		
		System.out.println("Entre com o nome do usuário:");
		usuarioSalvo=leia.nextLine();
		
		System.out.println("Entre com a senha:");
		senhaSalva=leia.nextLine();
		
	while (senhaSalva.equals(senhaSalva)) {
		System.out.println("nome de usuario e senha não podem ser iguais!DIGITE NOVAMENTE");
		break;
		
		
	}	 
	leia.close();
		
	
		
		
		
		
		
		
		
	}

}
