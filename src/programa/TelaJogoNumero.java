package programa;


import classes.Dificuldade;
import classes.JogoNumero;

public class TelaJogoNumero {

	public static void jogar(){
		
		JogoNumero jogo = new JogoNumero(Dificuldade.facil);
		jogo.desafio();
		int resposta = Tela1.in.nextInt();
		System.out.println((resposta == jogo.resultado?"Acertou":"Errou"));
		
		
		
	}
	
	
	
	
	
}
