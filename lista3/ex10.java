package lista3;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		System.out.println("digite a base");
		int base,expo,aux=1;
		base=leia.nextInt();
		System.out.println("digite o expoente");
		expo=leia.nextInt();
		for (int i = 1; i <= expo; i++) {
			aux=aux*base;
			
		}
		System.out.println(aux);
		
		
	}

}
