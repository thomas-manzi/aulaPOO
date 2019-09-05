package lista2;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double hora,salarioBruto,salarioLiq,ganhoHora,ir,inss,fgts;
		System.out.println("quantas horas vc trabalha no mes?");
		hora=leia.nextDouble();
		System.out.println("quanto vc ganha por hora");
		ganhoHora=leia.nextDouble();
		salarioBruto=hora*ganhoHora;
		if (salarioBruto<=900) {
			System.out.println("Isento de imposto de renda");
			
		}else if (salarioBruto>900 && salarioBruto<=1500) {
			ir=salarioBruto*0.05;
			inss=salarioBruto*0.10;
			fgts=salarioBruto*0.11;
			salarioLiq= salarioBruto-fgts-inss-ir;
			System.out.println("vc ganha "+salarioBruto+"\n o inss(10%) é "+inss+"\n o fgts(11%) é "+fgts+"\n o imposto de renda(5%) é "+ir+"\n o salario liquido é "+salarioLiq);
		}else if (salarioBruto>1500 && salarioBruto<=2500) {
			ir=salarioBruto*0.1;
			inss=salarioBruto*0.10;
			fgts=salarioBruto*0.11;
			salarioLiq= salarioBruto-fgts-inss-ir;
			System.out.println("vc ganha "+salarioBruto+"\n o inss é(10%) "+inss+"\n o fgts(11%) é "+fgts+"\n o imposto de renda é(10%) "+ir+"\n o salario liquido é "+salarioLiq);
		}else if (salarioBruto>2500) {
			ir=salarioBruto*0.2;
			inss=salarioBruto*0.10;
			fgts=salarioBruto*0.11;
			salarioLiq= salarioBruto-fgts-inss-ir;
			System.out.println("vc ganha "+salarioBruto+"\n o inss é(10%) "+inss+"\n o fgts(11%) é "+fgts+"\n o imposto de renda é(20%) "+ir+"\n o salario liquido é "+salarioLiq);
		}
		
	}

}
