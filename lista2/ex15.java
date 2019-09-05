package lista2;
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double preco;
		int cod;
		System.out.println("digite o preco do produto");
		preco=leia.nextDouble();
		System.out.println("digite o codigo do item");
		cod=leia.nextInt();
		if (cod==1) {
			System.out.println(cod+" o produto é do sul e custa R$ "+preco);
		} else if (cod==2) {
			System.out.println(cod+"o produto é do NORTE e custa R$ "+preco);
		}else if (cod==3) {
			System.out.println(cod+"o produto é do LESTE e custa R$ "+preco);
		}else if (cod==4) {
			System.out.println(cod+"o produto é do OESTE e custa R$ "+preco);
		}else if (cod==5 || cod==6) {
			System.out.println(cod+"o produto é do NORDESTE e custa R$ "+preco);
		}else if (cod==7 || cod==8) {
			System.out.println(cod+"o produto é do CENTRO-OESTE e custa R$ "+preco);
		}else {
			System.out.println(cod+"o produto IMPORTADO e custa R$ "+preco);
		}
	}
	

}
