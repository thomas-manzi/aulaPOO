package lista2;
import java.util.Scanner;
public class x7 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int n1,n2,n3;
		System.out.println("digite 3 numeros");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if (n1<n2 && n1<n3 && n2<n3) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		} 
		if (n2<n1 && n2<n3 && n1<n3) {
			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		}

}
}