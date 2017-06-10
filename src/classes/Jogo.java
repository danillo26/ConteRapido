package classes;

public abstract class Jogo {
	

	public Dificuldade dificuldade;
	
	public Jogo( Dificuldade dificuldade){
		
		this.dificuldade = dificuldade;
		
	}
	public abstract void desafio();
}
	