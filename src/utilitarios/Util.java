package utilitarios;
import java.util.Random;

import classes.Dificuldade;

public class Util {
	
	public static int numeroEntre(int ini,int fim){
		return new Random().nextInt(fim-ini+1)+ini;
	}
	
	public static Operacao gerarOperacao(){
		return Operacao.values()[new Random().nextInt(4)];
	}
	
	public static int multiplo(int n, Dificuldade dif){
		if (dif==Dificuldade.facil)  return n*(new Random().nextInt(10)+1);
		if (dif==Dificuldade.medio)  return n*(new Random().nextInt(25)+1);	
		return n*(new Random().nextInt(50)+1);		
	}
	
	public static int operar(int a, Operacao op, int b){
		if (op == Operacao.adicao) return a+b;
		else if (op == Operacao.multiplicacao) return a*b;
		else if (op == Operacao.subtracao) return a-b;
		else return b/a;
	}
	
}
