package excessoes;

public class EntradaNaoNumericaException extends Exception {
	
	public EntradaNaoNumericaException(){
		super("Entrada nao eh um numero inteiro.");
	}
}
