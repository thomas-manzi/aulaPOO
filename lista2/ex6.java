package lista2;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int troca;
		troca = leia.nextInt();
		if (troca % 2 ==0) {
			troca++;
			System.out.println(troca+" era par agora virou impar");
			
			
		}else if (troca % 2 ==1){
			troca++;
			System.out.println(troca+" era impar agr é par");
		}
	}

}
