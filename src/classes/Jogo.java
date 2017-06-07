package classes;

public abstract class Jogo {
	
	private int tipo;
	private Dificuldade dificuldade;
	
	public Jogo(int tipo, Dificuldade dificuldade){
		this.tipo = tipo;
		this.dificuldade = dificuldade;
	}
	
}
