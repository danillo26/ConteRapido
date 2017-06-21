package classes;

import utilitarios.Operacao;
import utilitarios.Util;

public class JogoDificil extends Jogo {

	public void desafio() {
		java.util.Random r = new java.util.Random();
		Operacao[] operacoes = { Operacao.adicao, Operacao.subtracao, Operacao.multiplicacao, Operacao.divisao };
		int operacaoEscolhida = r.nextInt(4);
		Operacao operacao = operacoes[operacaoEscolhida];

		int a = 0, b = 0;

		switch (operacao) {
		case adicao:
			a = Util.numeroEntre(20, 50);
			b = Util.numeroEntre(20, 50);
			break;

		case subtracao:
			a = Util.numeroEntre(20, 50);
			b = Util.numeroEntre(20, 50);
			break;

		case multiplicacao:
			a = Util.numeroEntre(10, 20);
			b = Util.numeroEntre(10, 20);
			break;

		case divisao:
			b = Util.numeroEntre(15, 30);
			a = Util.multiplo(a, Dificuldade.dificil);
			break;
		}
		if(setResultado(Util.operar(a, operacao, b))){
			System.out.println(a + " " + operacao + " " + b);
		}
		else desafio();		
	}


}
