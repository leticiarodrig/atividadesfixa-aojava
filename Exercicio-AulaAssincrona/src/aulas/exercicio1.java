package aulas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * Estamos em ano de elei��es. A empresa "Dados Incertos" precisa fazer uma
		 * pesquisa de inten��o de votos para divulgar no jornal do meio dia "Jornal da
		 * meia noite ao meio dia, segunda edi��o". Os candidatos s�o: Lula Molusco, da
		 * feira do biqu�ni, perdeu um tent�culo em acidente da ind�stria que trabalha.
		 * Bolso Nelson, dizem que cuida dos fazendeiros e muitas cabe�as de gado.
		 * Cilouca Gomes, pela volta do coronelismo no brasil,
		 * "O tempo do caf� com leite que era bom". Bolos Bolinho, parece que
		 * confeitaria � sua profiss�o mas na verdade ele atua no ramo imobili�rio. Crie
		 * as vari�veis necess�rias para contar a quantidade de votos que cada candidato
		 * possui e mostre na tela. Use a estrutura de repeti��o que achar melhor para
		 * essa atividade.
		 */

		int voto = 0;
		int lula = 0;
		int bolso = 0;
		int cilouca = 0;
		int bolos = 0;
		int invalido = 0;

		System.out.println("Em qual candidato voce prentende votar em 2022?");
		System.out.println("13- Lula Molusco");
		System.out.println("22- Bolso Nelson");
		System.out.println("12- Cilouca Gomes");
		System.out.println("50- Bolos Bolinhos");
		System.out.println("Digite o n�mero do candidato correspondente: 13 / 22 / 12 / 50 ");
		voto = leia.nextInt();

		switch (voto) {
		case 13:
			System.out.println("Vc escolheu: Lula Molusco" + lula);

			break;

		case 22:
			System.out.println("Vc escolheu: Bolso Nelson" + bolso);

			break;

		case 12:
			System.out.println("Vc escolheu: Cilouca Gomes" + cilouca);

			break;

		case 50:
			System.out.println("Vc escolheu: Bolos Bolinhos" + bolos);

			break;

		case 0:
			System.out.println("Candidato Inv�lido" + invalido);

			break;

			

		}

	}
}
