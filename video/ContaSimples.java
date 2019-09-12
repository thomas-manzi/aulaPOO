package video;

public class ContaSimples extends ContaBancaria{
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	public boolean depositoPoupanca(double valor){
		
		setSaldo(getSaldo()+valor);
		return true;
	}
	public boolean saquePoupanca(double valor){
		if (getSaldo()<0) {
			return false;
		}
		setSaldo(getSaldo()-valor);
		return true;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
