package lista4;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
        
        
        System.out.println("quantos numeros para verificar ");
        int qtd = x.nextInt();
        
        int[]numero = new int[qtd];   
        
            for (int i = 0; i < numero.length; i++) {

                    System.out.print("digite o numero ");
                    numero[i] = x.nextInt();
	
	        while((numero[i]<0)||(numero[i]>20)){
                    System.out.print("digite numero novamente ");
                    numero[i] = x.nextInt();
                }
		
            }
            
        System.out.println("grafico ");
        
            for (int i = 0; i < numero.length; i++) {
                System.out.print(" \n "+numero[i]+" : ");
                for (int j = 0; j < numero[i]; j++) {
                    System.out.print(" # ");
                }
                
            }
            
	}
}