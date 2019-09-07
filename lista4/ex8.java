package lista4;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		int[]s=new int[7];
		s[5]=1;
		s[6]=0;
		for (int i = 0; i < s.length-2; i++) {
			s[i]=x.nextInt();
			
			s[5]=s[i]*s[5];
			
			s[6]=s[i]+s[6];
		}
		for (int i = 0; i < s.length-2; i++) {
			System.out.println(s[i]);
			System.out.println("soma "+s[6]);
			System.out.println("multiplcacao"+s[5]);
		}
	}

}
