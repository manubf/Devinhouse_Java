package funcionarios;

public class Funcionario {
	String nome;
	String sobrenome;
	double salario;
	
	Funcionario(String nome, String sobrenome, double salario){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double setAumento(double aumentoPercentil) {
		this.salario = this.salario + (this.salario*aumentoPercentil);
		return this.salario;
	}
	
	
	public double getsalarioAnual() {
		double salario = getSalario();
		double totalAnual = 0.0;
		if (salario > 0) {
			totalAnual = (salario*13)+(salario*0.33);
		}
		return totalAnual;
	}
	

}
