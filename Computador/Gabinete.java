package Computador;

public class Gabinete {
private String modelo;
private String tipo;
private int balas;
protected PlacaMae placamae;
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public int getBalas() {
	return balas;
}
public void setBalas(int balas) {
	this.balas = balas;
}
public PlacaMae getPlacamae() {
	return placamae;
}
public void setPlacamae(PlacaMae placamae) {
	this.placamae = placamae;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Gabinete [modelo=");
	builder.append(modelo);
	builder.append(", tipo=");
	builder.append(tipo);
	builder.append(", balas=");
	builder.append(balas);
	builder.append(", placamae=");
	builder.append(placamae);
	builder.append("]");
	return builder.toString();
}

}
