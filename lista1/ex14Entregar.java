package lista1;
import java.util.Scanner;

public class ex14Entregar {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double salarioBruto,horas, salarioLiquido,inss,sindicato,ir,ganho;
		System.out.println("quantas horas vc trabalha por mes");
		horas =leia.nextFloat();
		System.out.println("quanto vc ganha por hora");
		ganho =leia.nextFloat();
		salarioBruto= horas*ganho;
		inss=salarioBruto*0.08;
		ir=salarioBruto*0.11;
		sindicato=salarioBruto*0.05;
		salarioLiquido=salarioBruto-ir-inss-sindicato;
		System.out.println("salario bruto "+salarioBruto);
		System.out.println("inss "+inss);
		System.out.println("ir "+ir);
		System.out.println("sindicato  "+sindicato);
		System.out.println("salario liquido "+salarioLiquido);

	}

}
