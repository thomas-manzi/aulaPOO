package lista4;
import java.util.Scanner;

public class ex15{
	public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
        
        float soma=0, media=0;  
        int t=5, qtd=0;
        int[]idade = new int[30];
        float[]altura = new float[30];
        
           
            for (int i = 0; i < t; i++) {
		System.out.print("digite idade ");
		idade[i] = x.nextInt();
	        	
	        System.out.print("digite altura ");
	        altura[i] = x.nextFloat();
                
                soma =soma+ altura[i];
		
            }
            media = soma/t;
            for (int i = 0; i < t; i++) {
                if(idade[i]>13){
                    if(altura[i] < media)
                     qtd++;   
                }
            }
        	
					
        System.out.println("alunos com 13 anos com media menor "+qtd);
            
	}
}