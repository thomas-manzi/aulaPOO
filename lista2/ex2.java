package lista2;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		float n;
		n = leia.nextFloat();
		if (n>0) {
			System.out.println(n+" � positivo");
		} else if(n<0){
			System.out.println(n+" � negativo");
			
		}else {
			System.out.println("� 0");
		}
	}

}
