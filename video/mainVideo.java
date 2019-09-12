package video;

public class mainVideo {

	public static void main(String[] args) {
		Banco b=new Banco();
		CartaoDeCredito cc=new CartaoDeCredito();
		ContaEspecial ce=new ContaEspecial();
		Pessoa p=new Pessoa();
		ContaSimples cs=new ContaSimples();
		ContaBancaria cb=new ContaBancaria();
		
		
		
		b.setCodigo(1);
		b.setNome("carioca");
		b.setNumeroAgencia(01);
		cc.setLimite(11.2);
		cc.setNumero(10);
		cc.setOperadora("Banco do Brasil");
		cc.setTipoDeCartao("debito");
		ce.setCartao(cc);
		ce.setDiasSemJuros(4);
		ce.setLimite(300.2);
		p.setEndereco("rua do if");
		p.setNome("albert");
		cs.setAgencia(109);
		cs.setBanco(b);
		cs.setCorrentista(p);
		cs.setNumeroDaConta(11);
		cs.setSaldo(300.4);
		cs.setSaldoPoupanca(500.3);
		cb.setAgencia(12);
		cb.setBanco(b);
		cb.setCorrentista(p);
		cb.setNumeroDaConta(03);
		cb.setSaldo(849.9);
		System.out.println(p);
		System.out.println(b);
		System.out.println(cc);
		System.out.println(ce);
		System.out.println(cs);
		System.out.println(cb);
		

	}

}
