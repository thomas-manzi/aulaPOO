package lista2;
import java.util.Scanner;
public class ex25 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int c,um,c5,n,cinq,dez;
		System.out.println("digite o saldo entre 10 e 600 reais");
		n=leia.nextInt();
		if (n>=10 && n<=600) {
			c=n/100;
			n=n%100;
			cinq=n/50;
			n=n%50;
			dez=n/10;
			n=n%10;
			c5=n/5;
			n=n%5;
			um=n/1;
			System.out.println(c+" notas de 100\n"+cinq+" notas de 50\n"+dez+" notas de 10\n"+c5+" notas de 5\n"+um+" notas de 1");
			
		}else {
			System.out.println("valor invalido");
		}

	}

}
