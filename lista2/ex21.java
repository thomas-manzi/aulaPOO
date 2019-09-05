package lista2;
import java.util.Scanner;
public class ex21 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int d,m,a;
		System.out.println("digite em forma dd/mm/aaaa");
		d=leia.nextInt();
		if (d>=1 && d<=31) {
			m=leia.nextInt();
			if (m>=1 && m<=12) {
				a=leia.nextInt();
				if (a>=1 ) {
					System.out.println(d+"/"+m+"/"+a);
				}
			}
			
		}else {
			System.out.println("digitou errado");
		}

	}

}
