package lista2;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int n1,n2,n3,maior,menor;
		System.out.println("digite 3 nunmeros");
		n1 =leia.nextInt();
		n2=leia.nextInt();
		n3=leia.nextInt();
		if (n1>n2 && n1>n3) {
			maior=n1;
			
		}else if(n2>n1 && n2>n3) {
			maior=n2;
		}else {
			maior=n3;
		}
		if (n1<n2 && n1<n3) {
			menor=n1;
			
		}else if(n2<n1 && n2<n3) {
			menor=n2;
		}else {
			menor=n3;
		}
		System.out.println("o menor numero é "+menor+"\n o maior numero é "+maior);
		
	}

}
