package program;

import java.util.Scanner;

import entity.pessoas;

	
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		pessoas pessoa = new pessoas();
		
		System.out.print("Entre com o nome:");
		pessoa.nome = sc.nextLine();
		
		System.out.print("Entre com a idade: ");
		pessoa.idade = sc.nextInt();
		
		System.out.print("Entre com o sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		System.out.println(pessoa.nome + "  " + pessoa.idade + "  " + pessoa.sexo);
		
		
		sc.close();
	}

}
