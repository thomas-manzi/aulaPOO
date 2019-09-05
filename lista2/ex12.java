package lista2;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double salario, valoraumento, novosalario;
		System.out.println("digite seu salario");
		salario =leia.nextDouble();
		if (salario<=280) {
			valoraumento=salario*0.2;
			novosalario=valoraumento+salario;
			System.out.println("seu salario "+salario+" 20% de aumento e o valor do aumento foi "+valoraumento+" e novo salario de "+novosalario);
		}
		else if (salario>280 && salario<=700) {
			valoraumento=salario*0.15;
			novosalario=valoraumento+salario;
			System.out.println("seu salario "+salario+" 15% de aumento e o valor do aumento foi "+valoraumento+" e novo salario de "+novosalario);
		}
		else if (salario>700 && salario<=1500) {
			valoraumento=salario*0.1;
			novosalario=valoraumento+salario;
			System.out.println("seu salario "+salario+" 10% de aumento e o valor do aumento foi "+valoraumento+" e novo salario de "+novosalario);
		}else if (salario>1500) {
			valoraumento=salario*0.05;
			novosalario=valoraumento+salario;
			System.out.println("seu salario "+salario+" 5% de aumento e o valor do aumento foi "+valoraumento+" e o novo salario de "+novosalario);
		} 
	}

}
