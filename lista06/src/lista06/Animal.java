package lista06;

public class Animal {

private String nome;

private String raca;

private Float comp;

private Integer NumPatas;

private String cor;

private String EcoSist;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

public Float getComp() {
	return comp;
}

public void setComp(Float comp) {
	this.comp = comp;
}

public Integer getNumPatas() {
	return NumPatas;
}

public void setNumPatas(Integer numPatas) {
	NumPatas = numPatas;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getEcoSist() {
	return EcoSist;
}

public void setEcoSist(String ecoSist) {
	EcoSist = ecoSist;
}

public void caminha() {
	
System.out.println("*andando*");


}
	
	
	
	
}
