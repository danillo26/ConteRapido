package classes;

import utilitarios.Operacao;
import utilitarios.Util;

public class JogoFacil extends Jogo {
	
	public JogoFacil() {

	}

	public void desafio() {
		java.util.Random r = new java.util.Random();
		Operacao[] operacoes = { Operacao.adicao, Operacao.subtracao, Operacao.multiplicacao, Operacao.divisao };
		int operacaoEscolhida = r.nextInt(4);
		Operacao operacao = operacoes[operacaoEscolhida];

		int a = 0, b = 0;

		switch (operacao) {
		case adicao:
			a = Util.numeroEntre(5, 15);
			b = Util.numeroEntre(5, 15);
			System.out.println(a + " " + operacao + " " + b);
			break;

		case subtracao:
			a = Util.numeroEntre(5, 15);
			b = Util.numeroEntre(5, 15);System.out.println(a + " " + operacao + " " + b);
			break;

		case multiplicacao:
			a = Util.numeroEntre(5, 15);
			b = Util.numeroEntre(5, 15);System.out.println(a + " " + operacao + " " + b);
			break;

		case divisao:
			a = Util.numeroEntre(5, 15);
			b = Util.multiplo(a, Dificuldade.facil);
			System.out.println(b + " " + operacao + " " + a);
			break;
		}
		
		setResultado(Util.operar(a, operacao, b));	
		
	}


}
