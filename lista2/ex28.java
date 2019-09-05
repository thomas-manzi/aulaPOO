package lista2;
import java.util.Scanner;
public class ex28 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		char resp;
		int cont=0;
		
		System.out.println("telefonou para a vitima? responda com 's' ou 'n'");
		resp=leia.next().charAt(0);
		if (resp=='s') {
			cont++;
		}
		System.out.println("esteve no local do crime?");
		resp=leia.next().charAt(0);
		if (resp=='s') {
			cont++;
		}
		System.out.println("mora perto da vitima?");
		resp=leia.next().charAt(0);
		if (resp=='s') {
			cont++;
		}
		System.out.println("devia para a vitima?");
		resp=leia.next().charAt(0);
		if (resp=='s') {
			cont++;
		}
		System.out.println("ja trabalhou com a vitima?");
		resp=leia.next().charAt(0);
		if (resp=='s') {
			cont++;
		}
		if (cont==2) {
			System.out.println("pessoa suspeita");
		}else if (cont==3 || cont==4) {
			System.out.println("cumplice");
		}else if(cont==5) {
			System.out.println("assasino");
		}else {
			System.out.println("inocente");
		}
	}

}
