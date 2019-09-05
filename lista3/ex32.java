package lista3;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int cod,car,vit,salvcod=0,salvcod2=0,menorv=0,tc=0,tv=0,maiorvit=0;
		double medcar,medvit;
		for (int i = 0; i < 4; i++) {
			System.out.println("digite cod cidade");
			cod=x.nextInt();
			System.out.println("quantos carros");
			car=x.nextInt();
			System.out.println("quantos acidentes?");
			vit=x.nextInt();
			if (i==1) {
				menorv=vit;
				salvcod=cod;
				maiorvit=vit;
				salvcod2=cod;
			}else if (vit<menorv) {
				menorv=vit;
				salvcod=cod;
			}else if (vit>maiorvit) {
				maiorvit=vit;
				salvcod2=cod;
			}
			tc=tc+car;
			if (car<2000) {
				tv=vit+tv;
			}
		}
		System.out.println("media de carros "+tc/5+"\n cidade com -2000 carros tem a media de"+tv/5+" maior cidade com acidente "+salvcod2+" com "+maiorvit+" acidentes e a menor"+menorv+" acidentes q é"+salvcod);
	}

}
