package lista3;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int contP=0,contI=0;
		for (int i = 1; i <=10; i++) {
			if (i%2==0) {
				contP++;
			}else {
				contI++;
			}
		}
		System.out.println(contP+" pares\n "+contI+" impares");
	}

}
