package programa;

import classes.Genero;
import classes.Jogador;
import excessoes.JogadorJaAdiconadoException;
import utilitarios.GeradorId;

public class Cadastro {

	public static void cadastrar() throws JogadorJaAdiconadoException{
		System.out.print("Digite seu nome: ");
		Tela1.in.nextLine();
		String nome = Tela1.in.nextLine();
		System.out.println("Voce e:\n\t0. homem\n\t1. mulher");
		int genero = Tela1.in.nextInt();
		Jogador j = new Jogador(GeradorId.gerador.gerarId(), nome, genero==0?Genero.homem:Genero.mulher, 0, 0);
		Tela1.repositorio.adicionarJogador(j);
		System.out.println("Anote seu id: " + j.getId());
		for(int i=0;i<10;i++)System.out.println();
	}
	
}
