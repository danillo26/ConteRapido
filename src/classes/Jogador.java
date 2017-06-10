package classes;

public class Jogador extends Pessoa {

	private int recorde;
	private int numJogos;
	
	public Jogador(int id, String nome, Genero genero, int recorde, int numJogos){
		super(id,nome, genero);
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
	
	public void print(){
		System.out.println(this.getNome());
		System.out.println(this.getGenero());
		System.out.println(this.getNumJogos());
		System.out.println(this.getRecorde());

	}
	
}
