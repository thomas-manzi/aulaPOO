package lista3;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		String nome;
		int idade;
		float salario;
		char sexo,estadaCivil;
		System.out.println("digite seu nome");
		nome=leia.nextLine();
		while(nome.length()<3) {
		    System.out.println("digite nome novamente");
		    nome=leia.nextLine();
		}
		System.out.println("digite sua idade");
		idade = leia.nextInt();
		while(idade<0 && idade>150) {
		    System.out.println("digite novamente sua idade");
		    idade=leia.nextInt();
		    
		}
		System.out.println("digite o salario");
		salario=leia.nextFloat();
		while(salario<=0) {
		    System.out.println("digite seu salario");
		    salario = leia.nextFloat();
		    
		    
		}
		System.out.println("digite sexo com 'm' ou 'f'");
		sexo=leia.next().charAt(0);
		while(sexo!='m' && sexo!='f'){
		    
		    
		    sexo = leia.next().charAt(0);
		}
	    
	    System.out.println("digite seu estado civil");
	    estadaCivil=leia.next().charAt(0);
	    while(estadaCivil!='s' && estadaCivil!='c' && estadaCivil!='d' && estadaCivil!='v' ){
	        System.out.println("digite seu estado civil ");
	        estadaCivil=leia.next().charAt(0);
	        
	    }

	}

}
