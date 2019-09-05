package lista3;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int n;
		n=leia.nextInt();
		while(n<0 || n>10) {
			System.out.println("digite dnv");
			n=leia.nextInt();
		}
		

	}

}
