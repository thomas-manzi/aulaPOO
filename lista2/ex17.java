package lista2;
import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double n1,n2,nota;
		char conceito = 0;
		System.out.println("digite 2 notas");
		n1=leia.nextDouble();
		n2=leia.nextDouble();
		nota=(n1+n2)/2;
		if (nota>=9 && nota<=10) {
			conceito='A';
		}else if (nota>=7.5 && nota<9) {
			conceito='B';
		}else if (nota>=6 && nota<7.5) {
			conceito='C';
		}else if (nota>=4 && nota<6) {
			conceito='D';
		}else if (nota<4) {
			conceito = 'E';
		}
		if (conceito=='A' || conceito=='B' || conceito=='C') {
			System.out.println(nota+" aprovado "+ conceito);
		}else {
			System.out.println(nota+" reprovado "+conceito);
		}
	}

}
