package repositorio;

import classes.Jogador;
import excessoes.*;

public interface RepositorioJogador {

	public Jogador procurarJogador(int id);
	
	public void removerJogador(int id);
	
	public void adicionarJogador(Jogador jogador);
	
	public void listarJogadores();
	
	public int size();
	
}
