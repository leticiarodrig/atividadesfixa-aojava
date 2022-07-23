package aulas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Faça um programa que peça o nome e a senha e faça a verificação de uma variável 
	 * que obtenha a senha e o usuário (como se fosse cadastrado) e retorne erro caso a
	 *  senha ou o usuário esteja errado. A mensagem a ser mostrada deve ser de acordo
	 *   com o respectivo erro! */
		
		Scanner leia =new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("login: ");
        String login = leia.nextLine();
       
        System.out.println("senha: ");
        String senha = leia.nextLine();
        
        
        if(login.equals("nayara") && senha.equals("123456789-09")){
            System.out.printf("Usuário %s logado com sucesso.", login);
        }else{
            System.out.println("Login ou senha inválidos!");
     }
        leia.close();
    }
		
		
		
	}


