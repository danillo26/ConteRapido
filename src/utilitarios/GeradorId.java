package utilitarios;

public class GeradorId {
	public static GeradorId gerador = new GeradorId();	
	private int idAtual = 0;
	
	private GeradorId (){}
	
	public int gerarId(){
		return idAtual++;
	}
	
}
