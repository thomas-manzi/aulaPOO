package lista2;
import java.util.Scanner;
public class ex22 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int n,d,c,u;
		System.out.println("digite um numero menor q 1000");
		n=leia.nextInt();
		if (n<1000) {
			c=n/100;
			n=n %100;
			d=n/10;
			n=n%10;
			u=n/1;
			System.out.println(c+" centenas\n"+d+" dezenas\n"+u+" unidades\n");
		}else {
			System.out.println(" digitou maior q mil");
		}
	}

}
