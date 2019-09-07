package lista4;

import java.util.Scanner;
public class ex12 {
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        
		System.out.print("Insira a entrada: ");
        String nome  = x.nextLine();
		
        String pont[] = nome.split(";");
        
        for (int i = 0; i < pont.length; i++) {
			System.out.println(pont[i]);
		}
       
		
        
	    
	}
}