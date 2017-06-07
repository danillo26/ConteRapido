package classes;

public class Jogador extends Pessoa {

	private int recorde;
	private int numJogos;
	
	public Jogador(String nome, Genero genero, int recorde, int numJogos){
		super(nome, genero);
		this.setNumJogos(numJogos);
		this.setRecorde(recorde);
	}

	public int getRecorde() {
		return recorde;
	}

	public void setRecorde(int recorde) {
		this.recorde = recorde;
	}

	public int getNumJogos() {
		return numJogos;
	}

	public void setNumJogos(int numJogos) {
		this.numJogos = numJogos;
	}
	
}
