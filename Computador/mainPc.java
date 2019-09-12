package Computador;

public class mainPc {

	public static void main(String[] args) {
		EquipamentoEletronico ee=new EquipamentoEletronico();
		Memoria mem=new Memoria();
		Processador p=new Processador();
		HD hd=new HD();
		PlacaMae pm=new PlacaMae();
		Gabinete g=new Gabinete();
		Teclado t=new Teclado();
		Monitor m=new Monitor();
		Mouse mous=new Mouse();
		Computador c=new Computador();
		
		mem.setCapacidade(10);
		mem.setMarca("HyperX");
		mem.setModelo("Kabum");
		mem.setVelocidade(8);
		p.setCache(300);
		p.setClock(10);
		p.setMarca("Intel ");
		p.setModelo("intel 7 ");
		hd.setCapacidade(1);
		hd.setMarca("kabum");
		hd.setModelo("usb");
		hd.setRpm(1000);
		pm.setHd(hd);
		pm.setMarca("intel");
		pm.setMemoria(mem);
		pm.setModelo("Intel");
		pm.setProcessador(p);
		g.setBalas(10);
		g.setModelo("Gabinete Gamer");
		g.setPlacamae(pm);
		g.setTipo("gamer");
		t.setMarca("GA Fallen");
		t.setTipo("gamer");
		m.setMarca("Zowie");
		m.setResolucao("1900 x 900");
		m.setTipo("full hd");
		mous.setMarca("razer");
		mous.setTipo("gamer");
		c.setConsumo(220);
		c.setGabinete(g);
		ee.setConsumo(220);
		ee.setTensao(100);
		c.setMarca("DEll");
		c.setModelo("gamer");
		c.setMonitor(m);
		c.setMouse(mous);
		c.setTeclado(t);
		c.setTensao(220);
		
		System.out.println(mem);
		System.out.println(hd);
		System.out.println(p);
		System.out.println(pm);
		System.out.println(g);
		System.out.println(t);
		System.out.println(m);
		System.out.println(mous);
		System.out.println(c);
		System.out.println(ee);
		System.out.println(c);
		

	}

}
