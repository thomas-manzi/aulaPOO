package lista4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		double[]d=new double[10];
		for (int i = 0; i < d.length; i++) {
			d[i]=x.nextDouble();
		}
		for (int i = d.length-1; i >= 0; i--) {
			System.out.println(d[i]);
		}
	}

}
