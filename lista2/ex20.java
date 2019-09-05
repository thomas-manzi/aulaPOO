package lista2;
import java.util.Scanner;
public class ex20 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int ano;
		System.out.println("digite um ano");
		ano=leia.nextInt();
		if (ano % 4==0 && ano % 100==0 && ano % 400==0) {
			System.out.println(ano+" é bissexto");
		} else {
			System.out.println(ano+" nao é bissexto");
		}
	}

}
