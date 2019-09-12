package criaCarro;

public class mainCar {

	public static void main(String[] args) {
		Motor m=new Motor();
		m.setCilindros(300);
		m.setCombustivel("100");
		m.setMarca("F1");
		m.setPotencia(300);
		
		Pessoa p=new Pessoa();
		p.setEndereco("rua jovina maria de jesus");
		p.setNome("carioca");
		
		
		Carro c=new Carro(p, m);
		c.setAno(2019);
		c.setCor("preto");
		c.setFabricante("mercedes ");
		c.setModelo("novo");
		
		System.out.println(c);

	}

}
