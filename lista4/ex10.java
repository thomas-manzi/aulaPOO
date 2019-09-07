package lista4;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		String txt;
		System.out.println("digite o texto");
		txt=x.nextLine();
		char[]t=new char[180];
		for (int i = 0; i < txt.length(); i++) {
			 t =txt.toCharArray();
			
		}
		for (int i = 0; i < txt.length(); i++) {
			System.out.println(t[i]);
		}

	}

}
