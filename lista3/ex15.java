package lista3;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n;
		System.out.println("digite ");
		n=x.nextInt();
		int n1=n, n2=n+1;
		double re,total=0;
		for (int i = 1; i <= n; i++) {
			re=(n1*n2)/i;
			System.out.println("("+n1+" * "+n2+")"+i);
			n1--;
			n2--;
			total=re+total;
			
		}
		System.out.println(total);
	}

}
