package programa;

import classes.Dificuldade;

public class SelecaoJogo {
	
	public static void print(String s){
		System.out.println(s);
	}
	
	public static void selecaoJogo() {
		print("--------------------------");
		print("Escolha o modo de jogo:");
		print("\t0. Facil");
		print("\t1. Medio");
		print("\t2. Dificil");
		print("\n3. Voltar ao menu principal");
		
		int input = Main.in.nextInt();
		
		if(input < 0 || input > 2) return;
		
		else{
			
			long tempoInicial = System.currentTimeMillis()/1000;
			
			boolean seg[] = {true, true, true};
			
			while(tempo(tempoInicial)){
				if(System.currentTimeMillis()/1000 == tempoInicial + 1&& seg[0]){
					print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					print("O jogo vai comecar em 3");
					seg[0] = false;
				}
				if(System.currentTimeMillis()/1000 == tempoInicial + 2 && seg[1]){
					print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					print("O jogo vai comecar em 2");
					seg[1] = false;
				}
				if(System.currentTimeMillis()/1000 == tempoInicial + 3 && seg[2]){
					print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					print("O jogo vai comecar em 1");
					seg[2] = false;
				}
						
			}
			
			Dificuldade dif = Dificuldade.values()[input];
			
			TelaJogo.jogar(dif);
			selecaoJogo();
		}
		
		
	}
	
	
	
	public static boolean tempo(long tempoInicial){
		return (System.currentTimeMillis()/1000) < (tempoInicial + 4);
	}
	
}
