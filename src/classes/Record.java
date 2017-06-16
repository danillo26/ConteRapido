package classes;

public class Record {
	private Jogador jogador;
	private int pontuacao;
	
	public Record(Jogador j, int pont){
		this.setJogador(j);
		this.setPontuacao(pont);
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	
}
