package programa;

import classes.Genero;
import classes.Jogador;
import repositorio.*;
import utilitarios.GeradorId;

public class Main {

	public static RepositorioJogador repositorio = new RepositorioJogadorArray();
	public static java.util.Scanner in = new java.util.Scanner(System.in);
	
	public static void print(String s){
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception {
		
		repositorio.adicionarJogador(new Jogador(0, "Daniel", Genero.homem, 0, 0));
		
		print("1. Logar");
		print("2. Cadastrar");
		print("3. Sair");
		int resposta = in.nextInt();
		
		if(resposta==1){
			Login.login();
		}
		else if(resposta==2){
			Cadastro.cadastrar();
			main(args);
		}
		else System.exit(0);
		
	}

}
