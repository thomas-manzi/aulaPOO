package lista4;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		double[]d=new double[5];
		for (int i = 0; i < d.length-1; i++) {
			d[i]=x.nextDouble();
			d[4]=d[i]+d[4];
		}
		d[4]=d[4]/4;
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}
