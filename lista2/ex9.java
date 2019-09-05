package lista2;
import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		char defsexo;
		double altura,pesoideal,peso;
		String nome,sexo;
		System.out.println("digite seu sexo com m para masculino f para feminino");
		defsexo =leia.next().charAt(0);
		if (defsexo=='m') {
			sexo="maculino";
			
		} else if(defsexo=='f') {
			sexo="feminino";
		}else {
			sexo="indefinido";
		}
		
		System.out.println("digite sua altura");
		altura = leia.nextDouble();
		System.out.println("digite seu peso");
		peso = leia.nextDouble();
		if (sexo=="feminino") {
			pesoideal=(62.1*altura)-44.7;
			System.out.println(sexo+"\n"+altura+"\n seu peso "+peso+" seu peso ideal "+ pesoideal);
			if (pesoideal==peso) {
				System.out.println("voce esta no peso ideal");
				
			} else if(pesoideal>peso) {
				System.out.println("voce esta a baixo do peso ideal");
			}else {
				System.out.println("voce esta a cima do peso ideal");
			}
			
		}else if(sexo=="masculino");
			pesoideal=(72.7*altura)-58;
			System.out.println(sexo+"\n"+altura+" de altura "+"\n seu peso "+peso+" seu peso ideal "+ pesoideal);
			if (pesoideal==peso) {
				System.out.println("voce esta no peso ideal");
				
			} else if(pesoideal>peso) {
				System.out.println("voce esta a baixo do peso ideal");
			}else {
				System.out.println("voce esta a cima do peso ideal");
			}
		
	}

}
