package lista2;
import java.util.Scanner;
public class ex27 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double n,n2,r=0;
		char ops;
		String par,positivo, decimal;
		System.out.println("qual operacao quer fazer, +,-,/,*");
		ops=leia.next().charAt(0);
		System.out.println("digite 2 numeros");
		n=leia.nextDouble();
		n2=leia.nextDouble();
		
		if (ops=='+') {
			r=n+n2;
		}else if (ops=='-') {
			r=n-n2;
		}else if (ops=='/') {
			r=n/n2;
		}else if (ops=='*') {
			r=n*n2;
		}else {
			System.out.println("operacao invalida");
		}
		if (r%2==0) {
			par="par";
			
		}else {
			par="impar";
		}
		if (r>=0) {
			positivo="positivo";
			
			
		}else {
			positivo="negativo";
		}
		if ((int) r==r) {
			decimal="inteiro";
		}else {
			decimal="decimal";
		}
		System.out.println(r+"\n"+par+"\n"+decimal+"\n"+positivo);
	}

}
