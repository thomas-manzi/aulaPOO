package lista5;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        
        int soma = 0, maior = 0, menor = 0, qtdp = 0, qtdi = 0, dp = 0, ds = 0;
        double media = 0;
        
        System.out.println("digite um impar entre 3 e 11:");
        int qtd = x.nextInt();
        
         while((qtd<0)&&(qtd>13)&&(qtd%2==0)){
                    System.out.print("digite valido ");
                    qtd = x.nextInt();
                }
        
        int matriz[][] = new int[qtd][qtd];   
        
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = x.nextInt();
                    
                    soma =soma+ matriz[i][j];
                    if((i == 1) && (j == 1)){
                        maior = matriz[i][j];
                        menor = matriz[i][j];
                    }
                    else if(matriz[i][j] > maior){
                        maior = matriz[i][j];
                    }
                    else if(matriz[i][j] < menor){
                        menor = matriz[i][j];
                    }
                    
                    if(matriz[i][j] % 2 == 0){
                        qtdp++;
                    }
                    else{
                        qtdi++;
                    }
                    
                    if(i==j)
                      dp =dp+ matriz[i][j];
                    
                    if((i+j) == (qtd+1))
                      ds =ds+ matriz[i][j];
                }     
                
            }
           media = soma/(qtd*qtd);
           System.out.println("soma "+soma);
           System.out.println("media "+media);
           System.out.println("maior valor "+maior);
           System.out.println("menor valor "+menor);
           System.out.println("quantidade par "+qtdp);
           System.out.println("quantidade impar "+qtdi);
           System.out.println("soma principal "+dp);
           System.out.println("soma secundária "+ds);
           
            for (int i = 0; i < qtd; i++) {
                for (int j = 0; j < qtd; j++) {
                   System.out.print(matriz[i][j]+"-");
                }
                System.out.print("\n");
            }
	}
}