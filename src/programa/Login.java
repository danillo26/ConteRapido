package programa;

import classes.Jogador;
import excessoes.JogadorNaoEncontradoException;

public class Login {
	
	public static void login() throws JogadorNaoEncontradoException{
		
		System.out.print("Digite seu id: ");
		int id = Tela1.in.nextInt();
		
		Jogador jogador = Tela1.repositorio.procurarJogador(id);
		Tela1.print("JOGADOR ENCONTRADO! ");
		jogador.print();
		
		SelecaoJogo.selecaoJogo();
		
		
	}
	
	
}
