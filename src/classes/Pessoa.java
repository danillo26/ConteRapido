package classes;
public class Pessoa {

	private String nome;
	private Genero genero;
	
	public Pessoa(String nome,Genero genero){
		this.setNome(nome);
		this.setGenero(genero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
}
