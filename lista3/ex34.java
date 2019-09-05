package lista3;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		boolean t=true;
		int n,c=0,c2=0,c3=0,c4=0;
		while (t) {
			System.out.println("digite");
			n=x.nextInt();
			if (n<=25) {
				c++;
			}else if (n>25 && n<=50) {
				c2++;
			}else if (n>50 && n<=75) {
				c3++;
			}else if (n>75 && n<=100) {
				c4++;
			}
			if (n<0) {
				t=false;
			}
		}

	}

}
