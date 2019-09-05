package lista3;
import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		System.out.println("digite 2 numeros");
		int n1,n2,anterior=0;
		n1=leia.nextInt();
		n2=leia.nextInt();
		if (n1>n2) {
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
		}
		 for (int i = n1; i <= n2; i++) {
			 anterior=i+anterior;
			System.out.println(anterior);
		}
		
	}

}
