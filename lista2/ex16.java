package lista2;
import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double nota;
		System.out.println("digite sua nota");
		nota=leia.nextDouble();
		if (nota>0 && nota<=3) {
			System.out.println("reprovado");
		}else if (nota>3 && nota<=6.9) {
			System.out.println("exame");
		}else if (nota>=7 ) {
			System.out.println("aprovado");
		}
	}

}
