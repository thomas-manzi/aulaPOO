package lista5;

import java.util.Scanner;
public class ex3 {
   public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
        
        float menor = 0, maior = 0, maiorm = 0, menorm = 0, somam = 0;
        String nomenor = "", nomaior = "", nomaiorm = "", nomenorm = "", abaixo = "";

        
        
        
        System.out.println("numero alunos");
        int qtd = x.nextInt();
                
        float matriz[][] = new float[qtd][2];  
        float s[] = new float[qtd];
        String aluno[] = new String[qtd];
        
            for (int i = 0; i < qtd; i++) {
                System.out.println("digite nome "+(i+1));
                aluno[i] = x.nextLine();
                for (int j = 0; j < 2; j++) {
                    System.out.println("Nota "+(j+1)+": ");
                    matriz[i][j] = x.nextFloat();
                    
                    if((i == 1)){
                        maior = matriz[i][j];
                        menor = matriz[i][j];
                        nomaior = aluno[i];
                        nomenor = aluno[i];
                    }
                    else if(s[i] > maior){
                        maior = matriz[i][j];
                        nomaior = aluno[i];
                    }
                    else if(s[i] < menor){
                        menor = matriz[i][j];
                        nomenor = aluno[i];
                }
                    s[i] += matriz[i][j];
                    
                }
                somam += s[i]/2;
                if((i == 1)){
                    maiorm = s[i]/2;
                    menorm = s[i]/2;
                    nomaiorm = aluno[i];
                    nomenorm = aluno[i];
                }
                else if((s[i]/2) > maiorm){
                    maiorm = (s[i]/2);
                    nomaiorm = aluno[i];
                }
                else if((s[i]/2) < menor){
                    menorm = (s[i]/2);
                    nomenorm = aluno[i];
                }
                
               
                
            }
            
           for (int i = 0; i < qtd; i++) {
               System.out.println("Aluno "+aluno[i]);
                for (int j = 0; j < 2; j++) {
                   System.out.println("Nota "+(j+1)+":"+matriz[i][j]);
                }
               System.out.println("Média: "+s[i]/2);
               
               if((s[i]/2) < (somam/qtd))
                   abaixo += aluno[i]+" , ";
                   
           }
           System.out.println("maior nota "+nomaior+" com "+maior);
           System.out.println("menor nota "+nomenor+" com "+menor);
           System.out.println("maior media "+nomaiorm+" com "+maiorm);
           System.out.println("menor media "+nomenorm+" com "+menorm);
           System.out.println("aluno com media abaixo  "+abaixo);

           
   }
}