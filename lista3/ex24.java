package lista3;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int cd;
		double preco,tot=0;
		System.out.println("digite quantos cd");
		cd=x.nextInt();
		for (int i = 1; i <= cd; i++) {
			System.out.println("digite o valor de cada cd");
			preco=x.nextDouble();
			tot=preco+tot;
		}
		tot=tot/cd;
		System.out.println(tot+" é a media");

	}

}
