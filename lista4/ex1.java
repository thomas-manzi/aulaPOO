package lista4;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		int[]d=new int[5];
		
		for (int i = 0; i < d.length; i++) {
			d[i]=x.nextInt();
			
		}
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}
