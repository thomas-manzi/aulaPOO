package lista2;
import java.util.Scanner;
public class ex29 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double litro, alc,gas,desconto,r,total;
		char pag;
		System.out.println("quantos litros comprados?");
		litro=leia.nextDouble();
		System.out.println("Escolha a gasolina A-alcool, G-Gasolina");
		pag=leia.next().charAt(0);
		if (pag=='A') {
			if (litro<=20.) {
				desconto=(1.90*0.03);
				r=desconto*litro;
				total=(1.90*litro)-r;
				System.out.println("valor do total "+total);
			}else {
				desconto=(1.90*0.05);
				r=desconto*litro;
				total=(1.90*litro)-r;
				System.out.println("valor do total "+total);
			}
		}else if (pag=='G') {
			if (litro<=20) {
				desconto=(2.50*0.04);
				r=desconto*litro;
				total=(2.50*litro)-r;
				System.out.println("valor do total "+total);
			}else {
				desconto=(2.50*0.06);
				r=desconto*litro;
				total=(2.50*litro)-r;
				System.out.println("valor do total "+total);
			}
		}else {
			System.out.println("combustivel invalido");
		}
	}

}
