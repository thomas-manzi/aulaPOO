package Fretes;

import java.util.ArrayList;
import java.util.List;

public class Frete {
	protected Motorista motorista;
	protected List<Cidade> cid;
	protected List<Item> itens;
	
	
	

	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public List<Cidade> getCid() {
		return cid;
	}
	public void setCid(List<Cidade> cid) {
		this.cid = cid;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	//construtor
	public Frete() {
		List<Cidade> cidad= new ArrayList<Cidade>();
		Motorista moto =new Motorista();
		List<Item> item= new ArrayList<Item>();
	}
	//5)
	//a
	public double valorTotalFrete(double vtotal) {
		vtotal=0;
		for (int i = 0; i < itens.size(); i++) {
			vtotal=itens.get(i).getValor() + vtotal;
			
		}
		return vtotal;
	}
	//b
	
	//c
	public Item maiorValor() {
		double maiorV=0;
		int r=0;
		for (int i = 0; i < itens.size(); i++) {
			if (i==0) {
				maiorV=itens.get(i).getValor();
				r=i;
			}else if (maiorV < itens.get(i).getValor()) {
				maiorV=itens.get(i).getValor();
				r=i;
			}
			
		}
		return itens.get(r);
	}
	//d
	public String nomeMotorista() {
		return motorista.getNome();
	}
	//e 
	@Override
	public String toString() {
		return "Frete [motorista=" + motorista + ", cid=" + cid + ", itens=" + itens + ", getMotorista()="
				+ getMotorista() + ", maiorValor()=" + maiorValor() + "]";
	}
	
	
	

}
