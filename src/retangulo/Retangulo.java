package retangulo;

public class Retangulo {
	double comprimento = 1.0;
	double largura = 1.0;

	public Retangulo(double comprimento, double largura) {
		this.comprimento = validarMedida(comprimento);
		this.largura = validarMedida(largura);
	}

	public double getComprimento() {
		return this.comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = validarMedida(comprimento);
	}

	public double getLargura() {
		return this.largura;
	}

	public void setLargura(double largura) {
		this.largura = validarMedida(largura);
	}

	public double validarMedida(double medida) {
		if (medida > 0.0 && medida < 20.0) {
			return medida;
		}
		return 1.0;
	}

	public double calculaArea() {
		return this.getComprimento() * this.getLargura();
	}

	public double calculaPerimetro() {
		return 2 * (this.getComprimento() + this.getLargura());
	}
}
