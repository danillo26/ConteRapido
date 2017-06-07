package repositorio;
import java.util.ArrayList;

import classes.Jogador;
public class RepositorioJogador {
	ArrayList<Jogador> array;
	
	public RepositorioJogador(){
		this.array = new ArrayList<Jogador>();
	}
	
	
	public int procurarJogador(Jogador jogador){
		for(int i= 0; i < array.size(); i++ ){
			if(array.get(i).getId()==jogador.getId()){
				return i;
			}
		}
		return -1;
	}
	
	public void removerJogador(Jogador jogador){
		int pos = procurarJogador(jogador);
		if(pos!=-1)array.remove(pos);
	}
	
	public void adicionarJogador(Jogador jogador){
		array.add(jogador);
	}
	
	public void listarJogadores(){
		for(int i= 0; i < array.size(); i++ ){
			System.out.println(array.get(i).getNome());
			System.out.println(array.get(i).getGenero());
		}
	}
	
	
}
