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
	
	
	public Jogador procurarJogador(int id) {
		try{
			int pos = getindex(id);
			if (pos == -1) throw new JogadorNaoEncontradoException();
			return array.get(pos);
		}
		catch(JogadorNaoEncontradoException e){
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	public void removerJogador(int id) {
		try{
			int pos = getindex(id);
			if (pos == -1)throw new JogadorNaoEncontradoException();
			else array.remove(pos);
		}
		catch(JogadorNaoEncontradoException e){
			System.err.println(e.getMessage());
		}
	}
	
	public void adicionarJogador(Jogador jogador) {
		int pos = -1;
		for(int i = 0; i < array.size();i++){
			if(array.get(i).getNome().equals(jogador.getNome())){
				pos =i;
				break;
			}
		}
		try{
			if(pos!=-1)throw new JogadorJaAdiconadoException();
			array.add(jogador);
		}
		catch(JogadorJaAdiconadoException e){
			System.err.println(e.getMessage());
		}
	}
	
	public void listarJogadores(){
		System.out.println("----------------------------");
		for(int i= 0; i < array.size(); i++ ){
			System.out.println(array.get(i).getNome());
			System.out.println(array.get(i).getGenero());
			System.out.println(array.get(i).getId());
			System.out.println("----------------------------");
		}
	}
	
	public int getindex(int id){
		for(int i= 0; i < array.size(); i++ ){
			if(array.get(i).getId()==id){
				return i;
			}
		}
		return -1;
	}
	
	public int size(){
		return this.array.size();
	}
	
	
}
