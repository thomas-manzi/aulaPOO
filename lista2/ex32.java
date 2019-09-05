package lista2;
import java.util.Scanner;
public class ex32 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		char q1='a',q2='a',q3='b',q4='b',q5='c',q6='c',q7='d',q8='d',q9='e',q10='e',q;
		int cont=0;
		System.out.println("questao 1");
		q=leia.next().charAt(0);
		if (q==q1) {
			cont++;
		}else {
			System.out.println(q1);
		}
		System.out.println("questao 2");
		q=leia.next().charAt(0);
		if (q==q2) {
			cont++;
		}else {
			System.out.println(q2);
		}
		System.out.println("questao 3");
		q=leia.next().charAt(0);
		if (q==q3) {
			cont++;
		}else {
			System.out.println(q3);
		}
		System.out.println("questao 4");
		q=leia.next().charAt(0);
		if (q==q4) {
			cont++;
		}else {
			System.out.println(q4);
		}
		System.out.println("questao 5");
		q=leia.next().charAt(0);
		if (q==q5) {
			cont++;
		}else {
			System.out.println(q5);
		}
		System.out.println("questao 6");
		q=leia.next().charAt(0);
		if (q==q6) {
			cont++;
		}else {
			System.out.println(q6);
		}
		System.out.println("questao 7");
		q=leia.next().charAt(0);
		if (q==q7) {
			cont++;
		}else {
			System.out.println(q7);
		}
		System.out.println("questao 8");
		q=leia.next().charAt(0);
		if (q==q8) {
			cont++;
		}else {
			System.out.println(q8);
		}
		System.out.println("questao 9");
		q=leia.next().charAt(0);
		if (q==q9) {
			cont++;
		}else {
			System.out.println(q9);
		}
		System.out.println("questao 10");
		q=leia.next().charAt(0);
		if (q==q10) {
			cont++;
		}else {
			System.out.println(q10);
		}
		System.out.println("acertou "+cont);
	}

}
