package lista2;
import java.util.Scanner;
public class ex31 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double kg,fd,al,pi,desc=0,total=0;
		char carne1,taba;
		String carne="a";
		System.out.println("escolha a carne para filé duplo -f, Alcatra - a,Picanha -p");
		carne1=leia.next().charAt(0);
		System.out.println("digite quantos kg");
		kg=leia.nextDouble();
		if (kg>5) {
			fd=5.80;
			al=6.80;
			pi=7.80;
		}else {
			fd=4.90;
			al=5.90;
			pi=6.90;
		}
		System.out.println("tem cartao tabajara 's' para SIM 'n' para NAO");
		taba=leia.next().charAt(0);
		if (taba=='s') {
			if (carne1=='f') {
				carne="file duplo";
				desc=(fd*kg)*0.05;
				total=(fd*kg)-desc;
			}else if (carne1=='a') {
				carne="alcatra";
				desc=(al*kg)*0.05;
				total=(al*kg)-desc;
			}else if (carne1=='p') {
				carne="picanha";
				desc=(pi*kg)*0.05;
				total=(pi*kg)-desc;
			}
		}else {
			if (carne1=='f') {
				carne="file duplo";
				total=(fd*kg);
			}else if (carne1=='a') {
				carne="alcatra";
				total=(al*kg);
			}else if (carne1=='p') {
				carne="picanha";
				total=(pi*kg);
			}
		}
		if (taba=='s') {
			System.out.println("comprou "+carne+" de "+kg+" kilos e pagou "+total+" com 5% de desconto com valor de "+desc);
		}else {
		System.out.println("comprou "+carne+" de "+kg+" kilos e pagou "+total);
		}
	}

}
