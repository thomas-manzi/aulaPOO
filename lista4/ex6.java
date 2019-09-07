package lista4;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		int[]par=new int[20];
		int[]impar=new int[20];
		int[]c=new int[20];
		for (int i = 0; i < c.length; i++) {
			c[i]=x.nextInt();
			if (c[i] %2==0) {
				par[i]=c[i];
			}else {
				impar[i]=c[i];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("pares"+par[i]+"\n");
			System.out.println("impares "+impar[i]+"\n");
			System.out.println(c[i]);
		}
	}

}
