package lista2;
import java.util.Scanner;
public class ex266 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double n;
		n=leia.nextDouble();
		
		if ((int)n==n) {
			System.out.println(n+" é inteiro");
		}else {
			System.out.println(n+" é decimal");
		}
	}

}
