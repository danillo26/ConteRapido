package repositorio;

import classes.Jogador;
import excessoes.*;

public interface RepositorioJogador {

	public Jogador procurarJogador(int id) throws JogadorNaoEncontradoException;
	
	public void removerJogador(int id) throws JogadorNaoEncontradoException;
	
	public void adicionarJogador(Jogador jogador) throws JogadorJaAdiconadoException;
	
	public void listarJogadores();
	
}
