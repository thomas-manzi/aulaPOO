package lista3;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
	Scanner leia=new Scanner(System.in);
	String senha,usuario;
	boolean f=true;
	while (f) {
		System.out.println("digite o usuario");
		usuario=leia.nextLine();
		System.out.println("digite sua senha");
		senha=leia.nextLine();
		if (usuario.equals(senha)) {
			f=true;
			
		}else {
			f=false;
		}
	}
	

	}

}
