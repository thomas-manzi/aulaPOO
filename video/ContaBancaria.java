package video;

public class ContaBancaria {
private int agencia;
private int numeroDaConta;
private double saldo;
protected Pessoa correntista;
protected Banco banco;
public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public int getNumeroDaConta() {
	return numeroDaConta;
}
public void setNumeroDaConta(int numeroDaConta) {
	this.numeroDaConta = numeroDaConta;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public Pessoa getCorrentista() {
	return correntista;
}
public void setCorrentista(Pessoa correntista) {
	this.correntista = correntista;
}
public Banco getBanco() {
	return banco;
}
public void setBanco(Banco banco) {
	this.banco = banco;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("ContaBancaria [agencia=");
	builder.append(agencia);
	builder.append(", numeroDaConta=");
	builder.append(numeroDaConta);
	builder.append(", saldo=");
	builder.append(saldo);
	builder.append(", correntista=");
	builder.append(correntista);
	builder.append(", banco=");
	builder.append(banco);
	builder.append("]");
	return builder.toString();
}
public boolean deposito(double valor) {
	setSaldo(getSaldo()+valor);
	return true;
}

public boolean saque(double valor) {
	
	if (getSaldo()-valor<0) {
		return false;
	}
	setSaldo(getSaldo()-valor);
	return true;
	
}


}
