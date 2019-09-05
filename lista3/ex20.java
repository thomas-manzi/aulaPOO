package lista3;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		double n,n1,r=0;
		System.out.println("digite quantas notas voce tem");
		n=x.nextDouble();
		for (int i = 1; i <=n; i++) {
			System.out.println("digite suas notas");
			n1=x.nextDouble();
			r=n1+r;
			if (i==n) {
				r=r/i;
			
			
			}
		}
		System.out.println(r);
	}

}
