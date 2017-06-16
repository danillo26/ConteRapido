package programa;

import classes.Jogador;
import excessoes.IDNaoCadastradoException;
import excessoes.JogadorNaoEncontradoException;

public class Login {
	
	public static void login() throws JogadorNaoEncontradoException, InterruptedException{
		
		System.out.print("Digite seu id: ");
		int id = Main.in.nextInt();
		
		Jogador jogador = Main.repositorio.procurarJogador(id);
		
		try{
			
			if(jogador == null) throw new IDNaoCadastradoException();
			System.out.println("--------------------------");
			System.out.println("Bem-vindo, " + jogador.getNome() + "!");
			Main.jogadorAtual = jogador;
			SelecaoJogo.selecaoJogo();
			
		}
		catch(IDNaoCadastradoException e){
			System.err.println(e.getMessage());
		}
	}
}
