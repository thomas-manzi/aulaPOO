package lista4;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		int d,m,a;
		int[]t=new int[3];
		System.out.println("digite dia");
		d=x.nextInt();
		System.out.println("digite o mes");
		m=x.nextInt();
		System.out.println("digite ano");
		a=x.nextInt();
		for (int i = 0; i < t.length; i++) {
			if (i==0) {
				t[i]=d;
			}else if (i==1) {
				t[i]=m;
			}else {
				t[i]=a;
			}
		}
		
	}

}
