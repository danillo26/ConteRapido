package programa;


//import classes.Dificuldade;
import classes.*;

public class TelaJogoNumero {
	
	public static void jogar() throws InterruptedException{
	
		Jogo jogo = new JogoFacil();
		
		UserInput ui = new UserInput();
		
		long tempoInicial = System.currentTimeMillis()/1000;
		
		
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
		
		System.out.println("saiu! voce acertou " + numAcertos);
		
	}
	
	public static boolean tempo(long tempoInicial){
		return (System.currentTimeMillis()/1000) < (tempoInicial + 30);
	}
	
	
	
	
	
}
