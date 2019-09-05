package lista3;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,cont=0;
		System.out.println("digite um nmero");
		n=x.nextInt();
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				cont++;
			}
		if (cont>=1) {
			
			
			if (n%i==0) {
				System.out.println(n+"é divisivel por "+i);
			}
		}	
		}

	}

}
