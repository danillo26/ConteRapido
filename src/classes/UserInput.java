package classes;

import programa.Main;
public class UserInput extends Thread {

	volatile int resposta;
	
	@Override
	public void run() {
		while(true)	resposta = Main.in.nextInt();
	}
	
	public int getResposta(){
		return this.resposta;
	}
	

}
