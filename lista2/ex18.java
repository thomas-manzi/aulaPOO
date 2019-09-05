package lista2;
import java.util.Scanner;
public class ex18 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double l1,l2,l3;
		System.out.println("digite 3 lados de um triangulo");
		l1=leia.nextDouble();
		l2=leia.nextDouble();
		l3=leia.nextDouble();
		if (l1+l2>l3 && l1+l3>l2 && l3+l2>l1) {
			if (l1!=l2 && l1!=l3 && l2!=l3) {
				System.out.println("escaleno");
			}else if (l1==l2 && l2==l3) {
				System.out.println("equilatero");
			}else {
				System.out.println("isoceles");
			}
		}
	}

}
