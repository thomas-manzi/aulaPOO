package lista3;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int cod,qnt;
		double preco,total=0;
		boolean t=true;
		while(t) {
			System.out.println("digite cod, caso acabe digite 0");
			cod=x.nextInt();
			System.out.println("quantidade");
			qnt=x.nextInt();
			if (cod!=0) {
				if (cod==100 || cod==103) {
					preco=1.20;
				}else if (cod==101 || cod==104) {
					preco=1.30;
				}else if (cod==105) {
					preco=1.0;
				}else {
					preco=1.50;
				}
				total=preco*qnt;
			}else {
				t=false;
			}
		}
		System.out.println(total);

	}

}
