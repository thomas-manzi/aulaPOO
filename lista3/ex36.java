package lista3;

import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int tv=1,c, c1=0,c2=0,c3=0,c4=0,b=0,n=0,pb,pn;
		boolean t=true;
		while (t) {
		System.out.println("1 / joao 2/ maria 3/ lula /4haddad 5/ nulo 6/ branco");
		c=x.nextInt();
			if (c==1) {
				c1++;
			}else if (c==2) {
				c2++;
			}else if (c==3) {
				c3++;
			}else if (c==4) {
				c4++;
			}else if (c==5) {
				n++;
			}else if(c==6) {
				b++;
			}else {
				n++;
			}
			tv++;
			if (c==0) {
				t=false;
			}
			
		}
		
		pb=tv*b;
		pn=(tv*n);
		System.out.println("joao "+c1+" maria "+c2+" lula "+c3+" haddad "+c4+" brancos "+b+" nulos "+n+"\n porcentagem branco "+pb+" % nulo "+pn);
	}

}
