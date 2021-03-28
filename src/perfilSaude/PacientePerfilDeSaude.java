package perfilSaude;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PacientePerfilDeSaude {
	String nome;
	String sobrenome;
	String dataNascimento;
	String sexo;
	double altura;
	int peso;

	PacientePerfilDeSaude(String nome, String sobrenome, String dataNascimento, String sexo, double altura,
			int peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getIdade() {
		LocalDate nascimento = LocalDate.parse(this.dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return Period.between(nascimento, LocalDate.now()).getYears();
	}

	public int getFrequenciaCardiacaMaxima() {
		return 220 - getIdade();
	}

	public int getMaximoAlvo() {
		return (int) (getFrequenciaCardiacaMaxima() * .85);
	}

	public int getMinimoAlvo() {
		return (int) (getFrequenciaCardiacaMaxima() * .5);
	}

	public double getImc() {
		return getPeso()/Math.pow(getAltura(), 2);
	}

}
