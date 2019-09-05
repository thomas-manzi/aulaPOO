package lista1;
import java.util.Scanner;

public class ex5Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		float metro, centimetro;
		System.out.println("digite os metros ");
		metro=leia.nextFloat();
		System.out.println(metro+"em centimetro é"+(centimetro=metro*100) );
		

	}

}
