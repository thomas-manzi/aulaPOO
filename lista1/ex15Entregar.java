package lista1;
import java.util.Scanner;
public class ex15Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double metros,gastoMetro,valorTinta,valorTotal;
		System.out.println("digite o tamanho em metros quadrados");
		metros = leia.nextDouble();
		gastoMetro=metros/3;
		valorTinta=gastoMetro/18;
		valorTotal= valorTinta*80;
		System.out.println("vao ser compradas "+valorTinta+" latas de tinta");
		System.out.println("vai ser gasto "+valorTotal+" latas de tinta");
		
	}

}
