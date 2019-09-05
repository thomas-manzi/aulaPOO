package lista3;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int total=0,turma,aluno;
		System.out.println("digite quantas turmas");
		turma=x.nextInt();
		for (int i = 1; i <= turma; i++) {
		System.out.println("digite quants alunos");
		aluno=x.nextInt();
		while (aluno>40) {
			System.out.println("o max de alunos sao 40 digite novamente");
			aluno=x.nextInt();
			}
		total=aluno+total;
		}
		total=total/turma;
		System.out.println("media de alunos por turma é "+total);
	}

}
