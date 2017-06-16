package programa;

import classes.Genero;
import classes.Jogador;
import excessoes.JogadorJaAdiconadoException;
import utilitarios.GeradorId;

public class Cadastro {

	public static void cadastrar() throws JogadorJaAdiconadoException{
		
		System.out.print("Digite seu nome: ");
		
		Main.in.nextLine();	
		String nome = Main.in.nextLine();
		
		System.out.println("Voce e:\n\t0. homem\n\t1. mulher");
		int genero = Main.in.nextInt();
		
		Jogador j = new Jogador(GeradorId.gerador.gerarId(), 
				nome, 
				genero==0 ? Genero.homem : Genero.mulher);
		
		int sizeAntes = Main.repositorio.size();
		
		Main.repositorio.adicionarJogador(j);
		
		int sizeDepois = Main.repositorio.size();
		
		if(sizeAntes != sizeDepois)	System.out.println("Anote seu id: " + j.getId());
		System.out.println("--------------------------");
		//Main.repositorio.listarJogadores();
	}
	
}
