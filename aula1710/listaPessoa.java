package aula1710;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class listaPessoa  {
	private List<Pessoa> pessoas;

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public listaPessoa () {
		pessoas= new ArrayList<Pessoa>();
	}
	
	public void incluir(Pessoa p) {
		pessoas.add(p);
	}
	
	public void excluir(int cod) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCodigo()==cod) {
				pessoas.remove(pessoa);
			}
		}
	}
	
	public void alterar(Pessoa p ) {
		for (Pessoa pessoa : pessoas) {
			if (p.getCodigo()==pessoa.getCodigo()) {
				pessoa.setNome(p.getNome());
				pessoa.setEmail(p.getEmail());
			}
		}
	}

	public String consultaNome (String letra) {
		String consulta=" ";
		for (Pessoa pessoa : pessoas) {
			if ((pessoa.getNome().toLowerCase().startsWith(letra.toLowerCase()))) {
				consulta=pessoa.getNome()+consulta;
			}
		}
		return consulta;
		
	}
	
	public String consultaDominio(String dom) {
		String domin=" ";
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getEmail().toLowerCase().contains(dom.toLowerCase())) {
				domin=pessoa.getEmail() + domin;
			}
		}
		return domin;
	}
	
	@SuppressWarnings("deprecation")
	public String aniversariantes(int mes) {
		return null;
	}
	private String mostrarPessoas() {
		String mostra="";
		if (!pessoas.isEmpty()) {
			
		
		for (Pessoa pessoa : pessoas) {
			mostra=pessoa.toString()+mostra+"\n";
		}
		
	}
		return mostra;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("listaPessoa =");
		builder.append(mostrarPessoas());
		builder.append("]");
		return builder.toString();
	}
}
