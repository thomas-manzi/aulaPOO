package lista3;
import java.util.Scanner;
public class ex19 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,cont=0,div=0;
		System.out.println("digite um nmero");
		n=x.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					cont++;
					if (cont<=2) {
						System.out.println(i+" é primo");
					}
				}
				div++;
			}
			
		}
		System.out.println("foram feitas "+div+" divisoes");

	}

}
