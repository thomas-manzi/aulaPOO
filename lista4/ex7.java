package lista4;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		int[]aluno=new int[10];
		double[]media=new double[10];
		double[]nota=new double[5];
		for (int i = 0; i < aluno.length; i++) {
			System.out.println("digite id do aluno");
			aluno[i]=x.nextInt();
			for (int j = 0; j < nota.length-1; j++) {
				System.out.println("digite nota aluno");
				nota[j]=x.nextDouble();
				nota[4]=nota[i]+nota[4];
			}
			media[i]=nota[4]/4;
			nota[4]=0;
		}
		
		for (int i = 0; i < media.length; i++) {
			if (media[i]>=7) {
				System.out.println("aluno "+aluno[i]);
				System.out.println("media "+media[i]);
			}
		}

	}

}
