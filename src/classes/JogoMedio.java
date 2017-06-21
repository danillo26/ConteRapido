package classes;

import utilitarios.Operacao;
import utilitarios.Util;

public class JogoMedio extends Jogo {

	public void desafio() {
		java.util.Random r = new java.util.Random();
		Operacao[] operacoes = { Operacao.adicao, Operacao.subtracao, Operacao.multiplicacao, Operacao.divisao };
		int operacaoEscolhida = r.nextInt(4);
		Operacao operacao = operacoes[operacaoEscolhida];

		int a = 0, b = 0;

		switch (operacao) {
		case adicao:
			a = Util.numeroEntre(10, 25);
			b = Util.numeroEntre(10, 25);
			break;

		case subtracao:
			a = Util.numeroEntre(10, 25);
			b = Util.numeroEntre(10, 25);
			break;

		case multiplicacao:
			a = Util.numeroEntre(5, 15);
			b = Util.numeroEntre(5, 15);
			break;

		case divisao:
			b = Util.numeroEntre(10, 25);
			a = Util.multiplo(a, Dificuldade.medio);
			break;
		}
		if(setResultado(Util.operar(a, operacao, b))){
			System.out.println(a + " " + operacao + " " + b);
		}
		else desafio();		
	}


}
