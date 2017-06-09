package repositorio;
import java.util.ArrayList;

import javax.sql.rowset.spi.TransactionalWriter;

import classes.Jogador;
import excessoes.JogadorJaAdiconadoException;
import excessoes.JogadorNaoEncontradoException;
public class RepositorioJogadorLista implements RepositorioJogador {
	ArrayList<Jogador> array;
	
	public RepositorioJogadorLista(){
		this.array = new ArrayList<Jogador>();
	}
	
	
	public boolean procurarJogador(Jogador jogador) throws JogadorNaoEncontradoException{
		int pos = getindex(jogador);
		if (pos == -1)throw new JogadorNaoEncontradoException();
		return pos!=-1;
	}
	
	public void removerJogador(Jogador jogador) throws JogadorNaoEncontradoException{
		int pos = getindex(jogador);
		if (pos == -1)throw new JogadorNaoEncontradoException();
		else array.remove(pos);
	}
	
	public void adicionarJogador(Jogador jogador) throws JogadorJaAdiconadoException{
		int pos = getindex(jogador);
		if(pos!=-1)throw new JogadorJaAdiconadoException();
		else array.add(jogador);
	}
	
	public void listarJogadores(){
		for(int i= 0; i < array.size(); i++ ){
			System.out.println(array.get(i).getNome());
			System.out.println(array.get(i).getGenero());
		}
	}
	
	public int getindex(Jogador jogador){
		for(int i= 0; i < array.size(); i++ ){
			if(array.get(i).getId()==jogador.getId()){
				return i;
			}
		}
		return -1;
	}
	
	
}
