package lista1;
import java.util.Scanner;
public class ex16Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double metros,valorTotal,litrosTinta,totalReais,totalReaisGalao,valorTotalGalao,totalReaisLata;
		System.out.println("quantos metros quadrados ");
		metros = leia.nextDouble();
		litrosTinta= metros/6;
		valorTotal= litrosTinta/18;
		valorTotalGalao= litrosTinta/3.6;
		totalReaisLata =valorTotal*80;
		totalReaisGalao= valorTotalGalao*25;
		System.out.println("comprar apenas lata "+totalReaisLata );
		System.out.println("comprar apenas galao "+totalReaisGalao);
		

	}

}
