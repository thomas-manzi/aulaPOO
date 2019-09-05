package lista1;
import java.util.Scanner;
public class ex12Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double altura;
		altura = leia.nextDouble();
		System.out.println("peso ideal para homem"+"\n"+((72.7*altura)-58));
		System.out.println("peso ideal para mulher"+"\n"+((62.1*altura)-44.7));

	}

}
