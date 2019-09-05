package lista2;
import java.util.Scanner;

public class ex3Lista {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		char sexo;
		sexo=leia.next().charAt(0);
		if(sexo=='f') {
			System.out.println("feminino");
			
			
		} else if(sexo=='m') {
			System.out.println("masculino");
		} else {
			System.out.println("voce digitou errado");
		}

	}

}
