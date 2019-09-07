package lista4;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
		
		int t = 10;
		int a[] = new int[t];
        int b[] = new int[t];
        int c[] = new int[20];

		
		for (int i = 0; i < t; i++) {
		 System.out.println("digite vetor a:");
                 a[i] = x.nextInt();
                 
                 System.out.println("digite vetor b: ");
                 b[i] = x.nextInt();
                 
                c[i]=a[i]; 
                c[i]=b[i];
		}
		
                System.out.println("c: ");
                for (int i = 0; i < 20; i++) {
                  System.out.println(c[i]);
                }
		

	}
}