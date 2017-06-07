package classes;
public class Pessoa {
	private int id;
	private String nome;
	private Genero genero;
	
	public Pessoa(int id,String nome,Genero genero){
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
