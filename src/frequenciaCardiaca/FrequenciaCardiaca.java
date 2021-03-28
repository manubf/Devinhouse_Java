package frequenciaCardiaca;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FrequenciaCardiaca {
	String nome;
	String sobrenome;
	String dataNascimento;
	
//	FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento) {
//		this.nome = nome;
//		this.sobrenome = sobrenome;
//		this.dataNascimento = dataNascimento;
//		
//	}
	
	

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

	public int getIdade() {
		LocalDate nascimento = LocalDate.parse(this.dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return Period.between(nascimento, LocalDate.now()).getYears();
	}
	
	public int getFrequenciaCardiacaMaxima() {
		return 220 - getIdade();
	}
	
	public int getMaximoAlvo(){
		return (int)(getFrequenciaCardiacaMaxima()*.85);	
	}
	
	public int getMinimoAlvo(){
		return (int)(getFrequenciaCardiacaMaxima()*.5);	
	}

}
