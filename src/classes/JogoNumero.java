package classes;

import utilitarios.Operacao;
import utilitarios.Util;

public class JogoNumero extends Jogo {

	public int resultado;
	
	public JogoNumero(Dificuldade dificuldade) {
		super( dificuldade);

	}

	public void desafio() {
		java.util.Random r = new java.util.Random();
		Operacao[] operacoes = { Operacao.adicao, Operacao.subtracao, Operacao.multiplicacao, Operacao.divisao };
		int operacaoEscolhida = r.nextInt(4);
		Operacao operacao = operacoes[operacaoEscolhida];

		int a = 0, b = 0;

		switch (operacao) {
		case adicao:
			a = Util.numeroEntre(5 * (int) Math.pow(dificuldade.ordinal() + 1, 2), 15 * (int) Math.pow(dificuldade.ordinal() + 1, 2));
			b = Util.numeroEntre(5 * (int) Math.pow(dificuldade.ordinal() + 1, 2), 15 * (int) Math.pow(dificuldade.ordinal() + 1, 2));
			System.out.println(a + " " + operacao + " " + b);
			break;

		case subtracao:
			a = Util.numeroEntre(5 * (int) Math.pow(dificuldade.ordinal() + 1, 2), 15 * (int) Math.pow(dificuldade.ordinal() + 1, 2));
			b = Util.numeroEntre(5 * (int) Math.pow(dificuldade.ordinal() + 1, 2), 15 * (int) Math.pow(dificuldade.ordinal() + 1, 2));
			System.out.println(a + " " + operacao + " " + b);
			break;

		case multiplicacao:
			a = Util.numeroEntre(5 * (int) Math.pow(dificuldade.ordinal() + 1, 2), 15 * (int) Math.pow(dificuldade.ordinal() + 1, 2));
			b = Util.numeroEntre(5 * (int) Math.pow(dificuldade.ordinal() + 1, 2), 15 * (int) Math.pow(dificuldade.ordinal() + 1, 2));
			System.out.println(a + " " + operacao + " " + b);
			break;

		case divisao:
			a = Util.numeroEntre(5 * (int) Math.pow(dificuldade.ordinal() + 1, 2), 15 * (int) Math.pow(dificuldade.ordinal() + 1, 2));
			b = Util.multiplo(a, dificuldade);
			System.out.println(b + " " + operacao + " " + a);
			break;

		}
		
		this.resultado = Util.operar(a, operacao, b);	
		

	}


}
