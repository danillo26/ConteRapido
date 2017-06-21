package classes;

import utilitarios.Operacao;
import utilitarios.Util;

public class JogoFacil extends Jogo {
	
	public void desafio() {
		java.util.Random r = new java.util.Random();
		Operacao[] operacoes = { Operacao.adicao, Operacao.subtracao, Operacao.multiplicacao, Operacao.divisao };
		int operacaoEscolhida = r.nextInt(4);
		Operacao operacao = operacoes[operacaoEscolhida];

		int a = 0, b = 0;

		switch (operacao) {
		case adicao:
			a = Util.numeroEntre(1, 15);
			b = Util.numeroEntre(1, 15);
			break;

		case subtracao:
			a = Util.numeroEntre(5, 15);
			b = Util.numeroEntre(5, 15);
			break;

		case multiplicacao:
			a = Util.numeroEntre(0, 10);
			b = Util.numeroEntre(0, 10);
			break;

		case divisao:
			b = Util.numeroEntre(5, 15);
			a = Util.multiplo(a, Dificuldade.facil);
			break;
		}
		if(setResultado(Util.operar(a, operacao, b))){
			System.out.println(a + " " + operacao + " " + b);
		}
		else desafio();
	}


}
