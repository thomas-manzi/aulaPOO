package lista1;
import java.util.Scanner;
public class ex13Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double peso,multa,excesso;
		System.out.println("digite o peso do peixe");
		peso = leia.nextFloat();
		excesso= peso-50;
		multa=(excesso*4.0);
		if (excesso>0) {
			System.out.println("sua multa é de "+multa);
		}
		else {
			System.out.println("Nao tem multa");
		}
		

	}

}
