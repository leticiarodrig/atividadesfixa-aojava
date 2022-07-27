package aulas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * Estamos em ano de eleições. A empresa "Dados Incertos" precisa fazer uma
		 * pesquisa de intenção de votos para divulgar no jornal do meio dia "Jornal da
		 * meia noite ao meio dia, segunda edição". Os candidatos são: Lula Molusco, da
		 * feira do biquíni, perdeu um tentáculo em acidente da indústria que trabalha.
		 * Bolso Nelson, dizem que cuida dos fazendeiros e muitas cabeças de gado.
		 * Cilouca Gomes, pela volta do coronelismo no brasil,
		 * "O tempo do café com leite que era bom". Bolos Bolinho, parece que
		 * confeitaria é sua profissão mas na verdade ele atua no ramo imobiliário. Crie
		 * as variáveis necessárias para contar a quantidade de votos que cada candidato
		 * possui e mostre na tela. Use a estrutura de repetição que achar melhor para
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
		System.out.println("Digite o número do candidato correspondente: 13 / 22 / 12 / 50 ");
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
			System.out.println("Candidato Inválido" + invalido);

			break;

			

		}

	}
}
