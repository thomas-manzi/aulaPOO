package aula1710;

import java.util.ArrayList;
import java.util.List;

public class mainTesta {

	public static void main(String[] args) {
		PersistenciaXML xml= new PersistenciaXML();
		listaPessoa ps=new listaPessoa();
		
		PersistenciaJson json = new PersistenciaJson();
		
		PersistenciaCSV csv = new PersistenciaCSV();
		
		List<Pessoa> lista= new ArrayList<Pessoa>();
		
		Pessoa p = new Pessoa();
		p.setCodigo(1);
		p.setNome("Rodgrigo");
		p.setEmail("rod@gmail");
		p.setTelefone("977127012");
		p.setDataNasc(Arruma_data.arrumaDateStrToCal("21/09/1999"));
		lista.add(p);
		
		
		p=new Pessoa();
		p.setCodigo(2);
		p.setDataNasc(Arruma_data.arrumaDateStrToCal("09/10/1998"));
		p.setNome("angelo");
		p.setEmail("dsae@uol.com");
		p.setTelefone("987786532");
		lista.add(p);
		
		p=new Pessoa();
		p.setCodigo(1);
		p.setNome("Caric");
		p.setEmail("dasda@gmail.com");

		
//		json.gravar(lista);
		lista = json.ler();
		
		System.out.println(lista);
		//xml.gravar(ps.getPessoas());
	}

}
