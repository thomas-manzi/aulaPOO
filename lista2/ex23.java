package lista2;
import java.util.Scanner;
public class ex23 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int i1,i2,i3,it;
		System.out.println("digite a idade de 3 aluns");
		i1=leia.nextInt();
		i2=leia.nextInt();
		i3=leia.nextInt();
		it=i1+i2+i3;
		if (it<25) {
			System.out.println("turma jovem");
			
		}else if (it>=25 && it<=40) {
			System.out.println("turma adulta");
		}else {
			System.out.println("turma idosa");
		}
	}

}
