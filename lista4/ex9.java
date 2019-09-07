package lista4;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		String alf="aeioubcdfghjklmnpqrstwxyz";
		// System.out.println(alf.substring(1,2));
		System.out.println("digite a senha <24");
		int senha;
		senha=x.nextInt();
		for (int i = 0; i < senha; i++) {
			System.out.println(alf.substring((int) Math.random()));		
				
		}
	}

}
