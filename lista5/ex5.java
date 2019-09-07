package lista5;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
	 Scanner x = new Scanner(System.in);
		        
	 int  cont = 0;
		        
		        
		        
	 System.out.println("quantas cartelas?");
	 int qtd = x.nextInt();
		                
	 int matriz[][] = new int[qtd][6];  
		        
	 	for (int i = 0; i < qtd; i++) {
		               
	 		for (int j = 0; j < 6; j++) { 
		                	
		        matriz[i][j] = (int) (Math.random() * 60);
		                    

		        for (int k = 0; k < cont; k++) {
		            if((matriz[i][j] == matriz[i][k]) && k != j){
		                	matriz[i][j] = (int) (Math.random() * 60);
		                   }else{
		                	   matriz[i][j] = matriz[i][j];
		                     }
		               }		           
		                }
		                  }	                
			                
		           for (int i = 0; i < qtd; i++) {
		               System.out.println("\ncartela ");
		               System.out.println("resultado");
		                for (int j = 0; j < 6; j++) {
		                   System.out.print(matriz[i][j]+"|");
		                } 
		                System.out.println("\n"); 
		           }	          
	}
}