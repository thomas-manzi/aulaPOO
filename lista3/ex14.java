package lista3;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
	Scanner leia=new Scanner(System.in);
	int n1,m=1,n=1;
	System.out.println("digite quantos termos");
	n1=leia.nextInt();
	for (int i = 0; i < n1; i++) {
		n++;
		m+=2;
		System.out.println(n+" / "+m);
	}
	
	}

}