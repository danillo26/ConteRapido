package repositorio;

import classes.Jogador;
import excessoes.*;

public interface RepositorioJogador {

	public boolean procurarJogador(Jogador jogador) throws JogadorNaoEncontradoException;
	
	public void removerJogador(Jogador jogador) throws JogadorNaoEncontradoException;
	
	public void adicionarJogador(Jogador jogador) throws JogadorJaAdiconadoException;
	
	public void listarJogadores();
	
}
