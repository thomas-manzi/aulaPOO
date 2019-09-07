package lista4;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		char[]d=new char[10];
		char[]con=new char[10];
		int c=0;
		for (int i = 0; i < d.length; i++) {
			d[i]=x.next().charAt(0);
			if (d[i]=='a' || d[i]=='e' || d[i]=='i' || d[i]=='o' || d[i]=='u') {
				
			}else {
				con[i]=d[i];
				c++;
			}
		}
		System.out.println(c+" consoantes");
		for (int i = 0; i < con.length; i++) {
			System.out.println(con[i]);
		}
	}

}
