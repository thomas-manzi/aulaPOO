package lista2;
import java.util.Scanner;
public class ex24 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double n1,n2,n3,n;
		System.out.println("digite 3 numeros");
		n1=leia.nextDouble();
		n2=leia.nextDouble();
		n3=leia.nextDouble();
		n=(n1+n2+n3)/3;
		if (n>=7) {
			System.out.println("Aprovado");
		}else if (n==10) {
			System.out.println("Aprovado com distincao");
		}else {
			System.out.println("reprovado");
		}

	}

}
