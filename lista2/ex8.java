package lista2;
import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double nota;
		System.out.println("digite sua nota");
		nota = leia.nextDouble();
		if (nota>=7) {
			System.out.println("aprovado com "+nota);
			
		}else {
			System.out.println("reprovado com "+nota);
		}

	}

}
