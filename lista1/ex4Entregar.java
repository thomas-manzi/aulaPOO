package lista1;
import java.util.Scanner;

public class ex4Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		float n1,n2,n3,n4;
		System.out.println("escreva suas notas");
		n1 = leia.nextFloat();
		n2 = leia.nextFloat();
		n3 = leia.nextFloat();
		n4 = leia.nextFloat();
		System.out.println("sua media final é"+ ((n1+n2+n3+n4)/4));

	}

}
