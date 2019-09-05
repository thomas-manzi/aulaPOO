package lista3;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("quantas temperaturas vao ser lidas?");
		double temp,media=0,menor=0,maior=0,total=0;
		int t;
		t=x.nextInt();
		for (int i = 1; i <= t; i++) {
			System.out.println("digite a temperatura");
			temp=x.nextDouble();
			if (i==1) {
				menor=temp;
				maior=temp;
			}else if (temp>maior) {
				maior=temp;
			}else if (temp<menor) {
				menor=temp;
			}
			total=temp+total;
		
		}
		media=total/t;
		System.out.println("media de temp"+media+" menor temp "+menor+" maior temp "+maior);

	}

}
