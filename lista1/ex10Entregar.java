package lista1;
import java.util.Scanner;

public class ex10Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int n1,n2;
		float n,p,p2,p3;
		n1 =leia.nextInt();
		n2= leia.nextInt();
		n=leia.nextFloat();
		p =((n1*2) * (n2/2));
		p2= ((n1*3) +n);
		p3= (n*n*n);
		System.out.println("resultados:"+p+"\n"+p2+"\n"+p3);
		

	}

}
