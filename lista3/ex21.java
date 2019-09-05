package lista3;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int i,n,r=0,med=0;
		System.out.println("quantas pessoas participaram");
		n=x.nextInt();
		for (int j = 1; j <= n; j++) {
			System.out.println("qual a idade");
			i=x.nextInt();
			r=r+i;
			if (j==n) {
				med=r/j;
			}
			
		}
		if (med>0 && med<=25) {
			System.out.println(med+" é a media e sao jovens");
		}else if (med>25 && med<60) {
			System.out.println(med+" é a media e sao adultos");
		}else {
			System.out.println(med+" e sao idosos");
		}

	}

}
