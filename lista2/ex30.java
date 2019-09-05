package lista2;
import java.util.Scanner;
public class ex30 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double kgmo,kgma, morango,maca,p1,p2,total,descont;
		System.out.println("quantos kg de morango");
		kgmo=leia.nextDouble();
		System.out.println("quantos kg de maca");
		kgma=leia.nextDouble();
		if (kgmo>5) {
			morango=2.20;
		}else {
			morango=2.50;
		}
		if (kgma>5) {
			maca=1.50;
		}else {
			maca=1.80;
		}
		p1=kgmo*morango;
		p2=kgma*maca;
		if (kgmo+kgma>5 || p1+p2>=25) {
			descont=(p1+p2)*0.10;
			total=(p1+p2)-descont;
		}else {
			total=p1+p2;
		}
		System.out.println(total);
	}

}
