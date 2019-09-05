package lista2;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int n1,n2;
		n1 =leia.nextInt();
		n2 =leia.nextInt();
		if (n1>n2) {
			System.out.println(n1+"é o maior");
		}
		else {
			System.out.println(n2+"é o maior");
		}
	}

}
