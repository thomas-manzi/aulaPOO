package lista3;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
	Scanner leia=new Scanner(System.in);
	System.out.println("digite o numero");
	int fat=1,n;
	n=leia.nextInt();
	for (int i = 2; i <= n; i++) {
		fat=fat*i;
	}
	System.out.println(fat);
	}

}
