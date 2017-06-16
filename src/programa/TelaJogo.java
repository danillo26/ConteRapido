package programa;


//import classes.Dificuldade;
import classes.*;

public class TelaJogo {
	
	public static void jogar(Dificuldade dif) {
	
		Jogo jogo = null;
		if(dif == Dificuldade.facil) jogo = new JogoFacil();
		if(dif == Dificuldade.medio) jogo = new JogoMedio();
		if(dif == Dificuldade.dificil) jogo = new JogoDificil();
		
		UserInput ui = new UserInput();
		
		long tempoInicial = System.currentTimeMillis()/1000;
		
		Main.in.nextLine();		//catando lixo
		
		ui.start();

		boolean acertou = true;
	
		int numAcertos = 0;
		
		for(int i = 0; i < 20; i++) System.out.println();
		
		while(tempo(tempoInicial)){
			if(acertou) jogo.desafio();
			
			acertou = false;
			
			if(ui.getResposta() == jogo.getResultado()){
				acertou = true;
				numAcertos++;
			}			
		}
		ui.setJogando(false);
		ui.interrupt();
		
		System.out.println("-------- tempo acabou --------");
		System.out.println("Voce acertou " + numAcertos + " operacoes!");
		Record r = new Record(Main.jogadorAtual, numAcertos);
		Main.records.setRecord(r, dif);
		System.out.println("-------- digite qualquer coisa para sair --------");
		
		//Esperando thread ui terminar
		try {
			ui.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean tempo(long tempoInicial){
		return (System.currentTimeMillis()/1000) < (tempoInicial + 30);
	}
	
	
	
	
	
}
