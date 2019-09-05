package lista3;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,come,term;
		System.out.println("tabuada de :");
		n=x.nextInt();
		System.out.println("comeca em:");
		come=x.nextInt();
		System.out.println("termina em:");
		term=x.nextInt();
		if (come>term) {
			System.out.println("o comeco nao pode ser maior q o fim troquei pra vc");
			come=come+term;
			term=come-term;
			come=come-term;
		}
		for (int i = come; i <= term; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}

}
