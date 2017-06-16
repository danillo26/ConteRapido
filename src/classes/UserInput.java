package classes;
import java.util.Scanner;
import excessoes.EntradaNaoNumericaException;
public class UserInput extends Thread {

	volatile int resposta;
	volatile boolean jogando = true;
	
	@Override
	public void run() {
		Scanner in = new Scanner(System.in);
		while(jogando)	{
			String aux = in.nextLine();
			if(!jogando) return;
			try{
				if(!aux.matches("[+-]?\\d+"))
					throw new EntradaNaoNumericaException();
				
				resposta = Integer.parseInt(aux);
			}
			catch (EntradaNaoNumericaException e){
				System.err.println(e.getMessage());
			}			
		}
		//for(int i = 0; i < 20; i++) System.out.println();
	}
	
	public void setJogando(boolean b){
		this.jogando = b;
	}
	
	public int getResposta(){
		return this.resposta;
	}
	

}
