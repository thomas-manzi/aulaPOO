package aula1710;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pessoaCSV {

	public static void main(String[] args) throws IOException {
		
		List<Pessoa> agenda= new ArrayList<Pessoa>();
		
		Scanner leia= new Scanner(System.in);
		FileWriter pes = new FileWriter("agendas.csv");
		PrintWriter gravaP = new PrintWriter(pes);
		for (Pessoa pessoa : agenda) {
			gravaP.printf("%d ; %s\n", pessoa.getCodigo(), pessoa.getNome(), pessoa.getEmail() , pessoa.getDataNasc(), pessoa.getTelefone() );
		}
		pes.close();

		
		for (Pessoa pessoa : agenda) {
			System.out.println(pessoa);
		}
	}

}
