package repositorio;

import classes.Jogador;
import excessoes.JogadorJaAdiconadoException;
import excessoes.JogadorNaoEncontradoException;

public class RepositorioJogadorArray  implements RepositorioJogador {
	Jogador[] jogadores;
	
	int size = 0;
	public RepositorioJogadorArray() {
		jogadores = new Jogador[100];
		// TODO Auto-generated constructor stub
	}
	
	public Jogador procurarJogador(int id) {
		int pos = 0;
		try{
			pos = getindex(id);
			if (pos == -1) throw new JogadorNaoEncontradoException();
			return jogadores[pos];
		}
		catch(JogadorNaoEncontradoException e){
			System.err.println(e.getMessage());
		}
		return null;
	}	
	

	
	public void removerJogador(int id) {
		try{
			int pos = getindex(id);
			if (pos == -1) throw new JogadorNaoEncontradoException();
			for(int i = pos; i<size-1;i++)jogadores[i]=jogadores[i+1];
			size--;
		}
		catch(JogadorNaoEncontradoException e){
			System.err.println(e.getMessage());
		}
	}

	
	public void adicionarJogador(Jogador jogador) {
		int pos = -1;
		for(int i = 0; i < size;i++){
			if(jogadores[i].getNome().equals(jogador.getNome())){
				System.out.println("bateu que " + jogadores[i].getNome() + " eh igual a " + jogador.getNome());
				pos = i;
				break;
			}
		}	
		try{
			if(pos != -1) throw new JogadorJaAdiconadoException();
			jogadores[size++]=jogador;
			if (size==jogadores.length){
				Jogador[] aux = new Jogador[size<<1];
				for(int i = 0; i<size;i++) aux[i]=jogadores[i];
				jogadores=aux;	
			}
		}
		catch(JogadorJaAdiconadoException e){
			System.err.println(e.getMessage());
		}
	}

	
	public void listarJogadores() {
		System.out.println("----------------------------");		
		for(int i= 0; i < size; i++ ){
			System.out.println(jogadores[i].getNome());
			System.out.println(jogadores[i].getGenero());
			System.out.println(jogadores[i].getId());
			System.out.println("----------------------------");
		}

		
	}
	
	public int getindex(int id){
		for(int i= 0; i <size ; i++ ){
			if(jogadores[i].getId()==id){
				return i;
			}
		}
		return -1;
	}
	
	public int size(){
		return this.size;
	}


}
