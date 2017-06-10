package programa;

import classes.Genero;
import classes.Jogador;
import repositorio.*;
import utilitarios.GeradorId;

public class Main {
	
	public static void print(String s){
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RepositorioJogador repositorio;// = new RepositorioJogadorLista();
		if(true){
			repositorio = new RepositorioJogadorArray();
		}
		java.util.Scanner in= new java.util.Scanner(System.in);
		
		print("1. Logar");
		print("2. Cadastrar");
		print("3. Sair");
		int resposta = in.nextInt();
		if(resposta==1){
			
		}
		else if(resposta==2){
			
		}
		//else{}
		
	}

}
