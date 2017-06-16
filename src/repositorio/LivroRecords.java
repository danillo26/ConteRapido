package repositorio;

import classes.Dificuldade;
import classes.Record;

public class LivroRecords {
	
	private Record recordFacil, recordMedio, recordDificil;
	
	public void setRecord(Record r, Dificuldade dif){
		
		if(getRecord(dif) == null){
			if(dif == Dificuldade.facil) recordFacil = r;
			if(dif == Dificuldade.medio) recordMedio = r;
			if(dif == Dificuldade.dificil) recordDificil = r;
			return;
		}
		
		if(dif == Dificuldade.facil)
			if(recordFacil.getPontuacao() < r.getPontuacao()) {
				recordFacil = r;
				System.out.println("Parabens, " + r.getJogador().getNome() + " !!!");
				System.out.println("Voce acaba de quebrar o record no modo Facil!");
				return;
			}
		
		if(dif == Dificuldade.medio)
			if(recordMedio.getPontuacao() < r.getPontuacao()) {
				recordMedio = r;
				System.out.println("Parabens, " + r.getJogador().getNome() + " !!!");
				System.out.println("Voce acaba de quebrar o record no modo Medio!");
				return;
			}
		
		if(dif == Dificuldade.dificil)
			if(recordDificil.getPontuacao() < r.getPontuacao()) {
				recordDificil = r;
				System.out.println("Parabens, " + r.getJogador().getNome() + " !!!");
				System.out.println("Voce acaba de quebrar o record no modo Dificil!");
				return;
			}
			
		
	}
	
	public Record getRecord(Dificuldade dif){
		if(dif == Dificuldade.facil) return recordFacil;
		if(dif == Dificuldade.medio) return recordMedio;
		if(dif == Dificuldade.dificil) return recordDificil;
		return null;
	}
	
	public void mostrarRecordes(){
		System.out.println("##################################");
		System.out.print("Record no modo FACIL: ");
		if(this.recordFacil == null) System.out.println("nao ha.");
		else{
			System.out.println("\nJogador:   " + this.recordFacil.getJogador().getNome());
			System.out.println("Pontuacao: " + this.recordFacil.getPontuacao());
		}
		System.out.println("----------------------------");
		
		System.out.print("Record no modo MEDIO: ");
		if(this.recordMedio == null) System.out.println("nao ha.");
		else{
			System.out.println("\nJogador:   " + this.recordMedio.getJogador().getNome());
			System.out.println("Pontuacao: " + this.recordMedio.getPontuacao());
		}
		System.out.println("----------------------------");
		System.out.print("Record no modo DIFICIL: ");
		if(this.recordDificil == null) System.out.println("nao ha.");
		else{
			System.out.println("\nJogador:   " + this.recordDificil.getJogador().getNome());
			System.out.println("Pontuacao: " + this.recordDificil.getPontuacao());
		}
		System.out.println("##################################");
	}
	
	
	
}
