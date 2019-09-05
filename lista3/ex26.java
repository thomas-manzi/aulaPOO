package lista3;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int p;
		double pao=0.18,total=0;
		System.out.println("quantos paes vai comprar");
		p=x.nextInt();
		for (int i = 1; i <= p; i++) {
			total=pao+total;
			if (pao==50) {
				break;
			}
		}
		System.out.println(total+" de reais para"+p+" paes");
	}

}
