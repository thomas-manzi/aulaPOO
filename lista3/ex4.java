package lista3;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double a,b,taxab,taxaA;
		int cont=0;
		System.out.println("informe a populacao A e B ");
		a=leia.nextDouble();
		b=leia.nextDouble();
		while(b>a) {
			taxaA=a*0.03;
			taxab=b*0.015;
			a=a+taxaA;
			b=b+taxab;
			cont++;
			
			
		}
		System.out.println(a+" populacao atual "+b+" populacao atual em "+cont+" anos");

	}

}
