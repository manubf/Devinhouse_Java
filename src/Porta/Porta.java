package Porta;

public class Porta {
	String cor;
	double largura;
	double altura;
	double profundidade;
	boolean aberta;

	void abre() {
		this.aberta = true;
	}
	
	void fecha() {
		this.aberta = false;
	}
	
	void pinta(String corAPintar) {
		this.cor = corAPintar;
	}

	public boolean isAberta() {
		return this.aberta;
	}
	
	public String isAbertaAsString() {
		if (this.aberta) {
			return "aberta";
		}
		
		return "fechada";
	}
	
}
