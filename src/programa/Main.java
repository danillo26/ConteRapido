package programa;

import repositorio.RepositorioJogadorLista;

public class Main {
	
	public static void print(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepositorioJogadorLista repositorio = new RepositorioJogadorLista();
		java.util.Scanner in= new java.util.Scanner(System.in);
		
		print("1. Logar");
		print("2. Cadastrar");
		print("3. Sair");
		int resposta = in.nextInt();
		if(resposta==1){
			
		}
		else if(resposta==2){
			
		}
		else{}
		
	}

}
