package lista5;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
        float menor = 0, maior = 0;
        double mediam = 0;
        
        float[]somap = new float[5];
        float[]somam = new float[5];
                
        float matriz[][] = new float[5][5];   
        
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("mercado "+(i+1));
                for (int j = 0; j < matriz.length; j++) {
                    System.out.println("produto "+(j+1)+" : ");
                    matriz[i][j] = entrada.nextInt();
                    
                    somap[j] =somap[j]+ matriz[i][j];
                    somam[i] =somam[i]+ matriz[i][j];
                    
                }
                if((i == 1)){
                    maior = somam[i];
                    menor = somam[i];
                }
                else if(somam[i] > maior){
                    maior = somam[i];
                }
                else if(somam[i] < menor){
                    menor = somam[i];
                }
                
            }
           
           System.out.println("soma preco dos supermercado ");  
           
           for (int i = 0; i < 5; i++) {      
                System.out.print("\nmercado "+(i+1)+" : "+somam[i]);
            }
           
           System.out.println("media produto ");
           for (int i = 0; i < 5; i++) {      
                System.out.print("\nproduto "+(i+1)+" : "+(somap[i]/5));
            }
            
           System.out.println("mercado mais caro "+maior);
           System.out.println("mercado mais barato "+menor);
           
            for (int i = 0; i < 5; i++) {
                System.out.println("precos supermercado "+(i+1));
                for (int j = 0; j < 5; j++) {
                   System.out.println("produto "+(j+1)+" : "+matriz[i][j]);
                }
            }
	}
}