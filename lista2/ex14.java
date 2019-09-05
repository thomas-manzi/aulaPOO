package lista2;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int n;
		n=leia.nextInt();
		System.out.println("dgite o numer do dia da semana");
		if (n==1) {
			System.out.println("domingo");
		}else if (n==2) {
			System.out.println("segunda");
		}else if (n==3) {
			System.out.println("terca");
		}else if (n==4) {
			System.out.println("quarta");
		}else if (n==5) {
			System.out.println("quinta");
		}else if (n==6) {
			System.out.println("sexta");
		}else if (n==7) {
			System.out.println("sabado");
		}else {
			System.out.println("numero invalido");
		}

	}

}
