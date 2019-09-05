package lista3;
import java.util.Scanner;
public class ex22 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("numero de votantes");
		int voto,n,c1=0,c2=0,c3=0,nulo=0;
		n=x.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("digite 1 para candidato 1, 2 para o candidato e 3 para o 3");
			voto=x.nextInt();
			if (voto==1) {
				c1++;
			}else if (voto==2) {
				c2++;
			}else if (voto==3) {
				c3++;
			}else {
				nulo++;
			}
		}
		System.out.println(c1+" numero de votos do candidato1 "+c2+" votos do candidato 2"+c3+" votos do candidato 3"+nulo+" votos nulo");

	}

}
