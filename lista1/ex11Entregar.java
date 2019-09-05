package lista1;
import java.util.Scanner;

public class ex11Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double altura;
		altura = leia.nextDouble();
		altura=((72.2*altura)-58);
		System.out.println("seu peso ideal é"+altura);

	}

}
