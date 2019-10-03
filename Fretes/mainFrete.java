package Fretes;

public class mainFrete {

	public static void main(String[] args) {
		Item i=new Item();
		Item ii = new Item();
		Cidade c=new Cidade();
		Cidade cid=new Cidade();
		Motorista m=new Motorista();
		Frete f=new Frete();
		
		
		m.setNome("gerson");
		c.setNome("Sao Paulo");
		cid.setNome("Rio de Janeiro");
		i.setValor(50.0);
		i.setCidade(cid);
		ii.setValor(30.0);
		ii.setCidade2(c);
		
		f.getMotorista();
		f.maiorValor();
		
		
		
		
		

	}

}
