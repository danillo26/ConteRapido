package programa;

import classes.Genero;
import classes.Jogador;
import excessoes.NaoHaJogadoresException;
import repositorio.*;
import utilitarios.GeradorId;

public class Main {

	public static RepositorioJogador repositorio = new RepositorioJogadorArray();
	public static LivroRecords records = new LivroRecords();
	public static Jogador jogadorAtual = null;
	public static java.util.Scanner in = new java.util.Scanner(System.in);
	
	public static void print(String s){
		System.out.println(s);
	}
	
	
	public static boolean modoTeste = false;

	public static void main(String[] args) throws Exception {
		
		if(modoTeste)
		repositorio.adicionarJogador(new Jogador(GeradorId.gerador.gerarId(), "Daniel", Genero.homem));
		
		
		print("1. Logar");
		print("2. Cadastrar");
		print("3. Instrucoes");
		print("4. Listar Jogadores");
		print("5. Recordes");
		print("6. Sair");
		int resposta = in.nextInt();
		
		if(resposta==1){
			Login.login();
		}
		else if(resposta==2){
			Cadastro.cadastrar();
			main(args);
		}
		else if(resposta==3){
			print("----------------------------");
			print("Conte Rapido eh um jogo para testar sua velocidade de raciocinio");
			print("\t-Voce recebera varias contas");
			print("\t-Voce deve resolver o maximo possivel");
			print("\t-Voce tem apenas 30 segundos para isso");
			print("----------------------------");
		}
		else if(resposta==4){
			try{
				if(repositorio.size() == 0) throw new NaoHaJogadoresException();
				repositorio.listarJogadores();
			}
			catch(NaoHaJogadoresException e){
				System.err.println(e.getMessage());
			}
			
		}
		else if(resposta == 5){
			records.mostrarRecordes();
		}
		else {
			print("===== Ate a proxima! =====");
			System.exit(0);
		}
		main(args);
		
	}

}
