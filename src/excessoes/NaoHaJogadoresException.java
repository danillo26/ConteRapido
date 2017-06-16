package excessoes;

public class NaoHaJogadoresException extends Exception {

	public NaoHaJogadoresException(){
		super("Nao ha jogadores cadastrados ate o momento");
	}
}
