package lista3;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int cod,salvcod=0,salvcod2=0;
		double alt,malt=0,mba=0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("codigo aluno");
			cod=x.nextInt();
			System.out.println("altura ");
			alt=x.nextDouble();
			if (i==1) {
				malt=alt;
				salvcod=cod;
				mba=alt;
				salvcod2=cod;
				
			}else if (alt>malt) {
				malt=alt;
				salvcod=cod;
			} else if (alt<mba) {
				mba=alt;
				salvcod2=cod;
			}
		}
		System.out.println("aluno "+salvcod2+" é o mais baixo com "+mba+" e o aluno "+salvcod+" é o mais alto "+malt);

	}

}
