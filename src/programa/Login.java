package programa;

import classes.Jogador;
import excessoes.JogadorNaoEncontradoException;

public class Login {
	
	public static void login() throws JogadorNaoEncontradoException, InterruptedException{
		
		System.out.print("Digite seu id: ");
		int id = Main.in.nextInt();
		
		Jogador jogador = Main.repositorio.procurarJogador(id);
		Main.print("JOGADOR ENCONTRADO! ");
		jogador.print();
		
		SelecaoJogo.selecaoJogo();
		
		
	}
	
	
}
