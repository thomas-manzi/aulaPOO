package lista3;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		boolean t=true;
		int i=1,cod;
		double peso,alt,mp=0,ma=0,gordao=0,magrao=0,altao=0,baixin=0,talt=0,tpeso=0;
		while (t) {
			System.out.println("digite o codigo");
			cod=x.nextInt();
			if (cod==0) {
				t=false;
			}
			System.out.println("digite o peso");
			peso=x.nextDouble();
			System.out.println("digite a altura");
			alt=x.nextDouble();
			if (i==1) {
				gordao=peso;
				magrao=peso;
				altao=alt;
				baixin=alt;
			}else if (peso>gordao) {
				gordao=peso;
			}else if (peso<magrao) {
				magrao=peso;
			}else if (alt>altao) {
				altao=alt;
			}else if (alt<baixin) {
				baixin=alt;
			}
			talt=alt+talt;
			tpeso=peso+tpeso;
			
			i++;
		}
		ma=talt/i;
		mp=tpeso/i;
		System.out.println("mais gordo "+gordao+" mais magro"+magrao+" mais alto"+altao+" mais baixo"+baixin+" media altura"+ma+" media peso"+mp);
	}

}
