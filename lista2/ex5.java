package lista2;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		char vogal;
		vogal =leia.next().charAt(0);
		if (vogal == 'a' || vogal=='e' || vogal=='i' || vogal=='o' || vogal=='u' ) {
			System.out.println(vogal+" é vogal ");
			
		} else {
			System.out.println(vogal+" é consoante");
		}
	}

}
