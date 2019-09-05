package lista1;
import java.util.Scanner;

public class ex8Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		float ganho, horas, salario;
		System.out.println("quantas horas vc trabalha por mes");
		horas =leia.nextFloat();
		System.out.println("quanto vc ganha por hora");
		ganho =leia.nextFloat();
		salario= horas*ganho;
		System.out.println("seu salario é "+salario);
		
		

	}

}
