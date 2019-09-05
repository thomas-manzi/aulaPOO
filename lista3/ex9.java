package lista3;
import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		System.out.println("digite o numero da tabuada");
		int n,aux;
		n=leia.nextInt();
		for (int i = 1; i <=10; i++) {
			aux=n*i;
			System.out.println(n+" x "+i+" = "+aux );
		}
	}

}
