package lista1;
import java.util.Scanner;

public class ex9Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double f,c;
		System.out.println("digite a temperatura em farenheit");
		f =leia.nextFloat();
		c=((f-32)/1.8);
		System.out.println("a temperatura em graus celcius é"+c);
	}

}
