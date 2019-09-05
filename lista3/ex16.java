package lista3;
import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("determine quantos numeros vai ler");
		int n,menor=0,maior=0,n1,res=0;
		n=x.nextInt();
		for (int i = 1; i <= n; i++) {
			n1=x.nextInt();
			if (i==1) {
				maior=n1;
				menor=n1;
			}else {
				if (maior<n1) {
					maior=n1;
				}
			}
			if (menor>n1) {
				menor=n1;
			}
			res=n1+res;
		}
		System.out.println("o menor é "+menor+" o maior é "+maior+" a soma é "+res);
	}

}
