package Fretes;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private double valor;
	private String rastreio;
	protected Cidade cidade;
	protected Cidade cidade2;
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getRastreio() {
		return rastreio;
	}

	public void setRastreio(String rastreio) {
		this.rastreio = rastreio;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Cidade getCidade2() {
		return cidade2;
	}

	public void setCidade2(Cidade cidade2) {
		this.cidade2 = cidade2;
	}

	public Item() {
		Cidade origem=new Cidade();
		Cidade destino=new Cidade();
	}

	@Override
	public String toString() {
		return "Item [valor=" + valor + ", rastreio=" + rastreio + ", cidade=" + cidade + ", cidade2=" + cidade2 + "]";
	}

}
