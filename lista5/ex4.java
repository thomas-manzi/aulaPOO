package lista5;

import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		        
		float  maiorm = 0, menorm = 0;
		                
		System.out.println("digite numero de aluno");
		        int qtd = x.nextInt();
		                
		        float matriz[][] = new float[qtd][5];  
		        float somaa[] = new float[qtd];
		        
		            for (int i = 0; i < qtd; i++) {
		                System.out.println("digite o saltos "+i);
		               
		                for (int j = 0; j < 5; j++) {
		                    System.out.println("Salto "+j+": ");
		                    matriz[i][j] = x.nextFloat();
		                    
		                    somaa[i] += matriz[i][j];
		                    
		                }
		                if((i == 1)){
		                    maiorm = somaa[i]/5;
		                    menorm = somaa[i]/5;

		                }
		                else if((somaa[i]/5) > maiorm)
		                    maiorm = (somaa[i]/5);

		                
		                else if((somaa[i]/5) < menorm)
		                    menorm = (somaa[i]/5);		               
		                
		            }
		            
		           for (int i = 0; i < qtd; i++) {
		               System.out.println("aluno "+i);
		                for (int j = 0; j < 5; j++) {
		                   System.out.println("salto "+j+": "+matriz[i][j]);
		                }
		               System.out.println("media: "+somaa[i]/5);
		     
		                   
		           }

		           System.out.println("maior media saltos "+maiorm);
		           System.out.println("menor media salto "+menorm);
		          

	}
}