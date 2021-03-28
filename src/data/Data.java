package data;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void dataInteira() {
		int dia = getDia();
		int mes = getMes();
		int ano = getAno();
		System.out.println(dia + "/" + mes + "/" + ano);				
	}
	

}
