package criaCarro;

public class Carro {
private String cor,modelo,fabricante;
private int ano;
protected Pessoa pessoa;
protected Motor motor;
public Carro(Pessoa p,Motor m ) {
	setPessoa(p);
	setMotor(m);
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Carro [cor=");
	builder.append(cor);
	builder.append(", modelo=");
	builder.append(modelo);
	builder.append(", fabricante=");
	builder.append(fabricante);
	builder.append(", ano=");
	builder.append(ano);
	builder.append(", pessoa=");
	builder.append(pessoa);
	builder.append(", motor=");
	builder.append(motor);
	builder.append("]");
	return builder.toString();
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getFabricante() {
	return fabricante;
}
public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public Pessoa getPessoa() {
	return pessoa;
}
public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
}
public Motor getMotor() {
	return motor;
}
public void setMotor(Motor motor) {
	this.motor = motor;
}
}
