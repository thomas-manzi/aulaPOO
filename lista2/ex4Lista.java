package lista2;
import java.util.Scanner;
public class ex4Lista {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		System.out.println("entre com um ano de 4 digitos");
		int ano;
		ano =leia.nextInt();
		if (ano % 4==0 && ano % 100>1) {
			System.out.println(ano+" é bixssexto");
			
		} else {
			System.out.println("nao é bissexto");
		}

	}

}
