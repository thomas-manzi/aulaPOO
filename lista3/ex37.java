package lista3;

import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		char s,q1='a',q2='b',q3='c',q4='d',q5='e',q6='e',q7='d',q8='c',q9='b',q10='a',q;
		double med;
		int cont=0,ca=1,tt=0,menor=0,maior=0;
		boolean t=true;
		while(t) {
		System.out.println("questao 1");
		q=leia.next().charAt(0);
		if (q==q1) {
			cont++;
		}
		System.out.println("questao 2");
		q=leia.next().charAt(0);
		if (q==q2) {
			cont++;
		}
		System.out.println("questao 3");
		q=leia.next().charAt(0);
		if (q==q3) {
			cont++;
		}
		System.out.println("questao 4");
		q=leia.next().charAt(0);
		if (q==q4) {
			cont++;
		}
		System.out.println("questao 5");
		q=leia.next().charAt(0);
		if (q==q5) {
			cont++;
		}
		System.out.println("questao 6");
		q=leia.next().charAt(0);
		if (q==q6) {
			cont++;
		}
		System.out.println("questao 7");
		q=leia.next().charAt(0);
		if (q==q7) {
			cont++;
		}
		System.out.println("questao 8");
		q=leia.next().charAt(0);
		if (q==q8) {
			cont++;
		}
		System.out.println("questao 9");
		q=leia.next().charAt(0);
		if (q==q9) {
			cont++;
		}
		System.out.println("questao 10");
		q=leia.next().charAt(0);
		if (q==q10) {
			cont++;
		}
		if (ca==1) {
			maior=cont;
			menor=cont;
		}else if (cont>maior) {
			maior=cont;
		}else if (cont<menor) {
			menor=cont;
		}
		//media
		tt=tt+cont;
		
		System.out.println("outra pessoa vai utilizar?'s' ou 'n'");
		ca++;
		s=leia.next().charAt(0);
		if (s=='n') {
			t=false;
		}
		}
		med=tt/ca;
		System.out.println("mdia "+med+" total aluno q usaram "+ca+" maior "+maior+" menor "+menor);
	}

}
