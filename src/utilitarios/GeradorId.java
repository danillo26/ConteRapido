package utilitarios;

public class GeradorId {
	public static GeradorId gerador = new GeradorId();	
	private int idAtual = 1;
	
	private GeradorId (){}
	
	public int gerarId(){
		int aux = idAtual;
		idAtual++;
		return aux;
	}
	
}
