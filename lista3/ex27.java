package lista3;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		boolean t=true;
		double prod,total=0,din=0,troco=0;
		String ta="Lojas Tabajara";
		while(t) {
			System.out.println("digite os preco dos produtos");
			prod=x.nextDouble();
			total=total+prod;
			if (prod==0) {
				System.out.println("dinheiro recebido");
				din=x.nextDouble();
				troco=total-din;
				t=false;
			}
		}
		System.out.println(ta+"\n total de reais "+total+" - dinheiro recebido "+din+" troco "+troco);

	}

}
