package lista2;
import java.util.Scanner;
public class ex26 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int n;
		System.out.println("digite um numero");
		n=leia.nextInt();
		if (n%2==0) {
			System.out.println("é par");
		}else {
			System.out.println("é impar");
		}

	}

}
