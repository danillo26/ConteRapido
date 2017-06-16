package excessoes;

public class IDNaoCadastradoException extends Exception {
	
	public IDNaoCadastradoException(){
		super("Esse ID nao existe na base de dados.");
	}
}
