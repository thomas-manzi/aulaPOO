package lista1;
import java.util.Scanner;

public class ex6Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		System.out.println("digite o raio do circulo");
		double raio,area, pi= 3.14;
		raio=leia.nextDouble();
		area=((raio*raio)*pi);
		System.out.println("a area do circulo é"+area);
		

	}

}
