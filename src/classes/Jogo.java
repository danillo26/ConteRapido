package classes;

public abstract class Jogo {
	
	private int record;
	private int resultado;
	
	public Jogo(){
		
	}
	
	public abstract void desafio();

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public int getResultado() {
		return resultado;
	}

	public boolean setResultado(int resultado) {
		if(resultado == this.resultado) return false;
		this.resultado = resultado;
		return true;
	}
}
	