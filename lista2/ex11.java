package lista2;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		char horario;
		System.out.println("digite seu horario M-matutino, V-vestertino N-noturno");
		horario = leia.next().charAt(0);
		if (horario=='v') {
			System.out.println("boa tarde");
			
		}else if(horario=='m') {
			System.out.println("boa manha");
		}else if(horario=='n') {
			System.out.println("boa noite");
		}else {
			System.out.println("horario invalido");
		}
	}

}
