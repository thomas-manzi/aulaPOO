package lista3;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("quantos itens vai levar");
		int item;
		double preco=1.99,total=0;
		item=x.nextInt();
		for (int i = 1; i <= item; i++) {
			total=total+preco;
			if (item==50) {
				break;
			}
		}
		System.out.println(total+" total de reais de "+item+" itens");
	}

}
