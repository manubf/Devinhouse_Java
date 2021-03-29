package funcionarios;

public class Funcionario {
	protected String nome;
	protected String sobrenome;
	protected String cpf;
	protected double salario;
	protected double bonificacao;
	protected double salarioComBonus;
	
	Funcionario(String nome, String sobrenome, double salario, String cpf ){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		this.cpf = cpf;
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
	
		
	public double geraBonificacao() {
		return this.bonificacao = getSalario()*0.10;
	}

	public double getSalarioComBonus() {
		return this.salarioComBonus;
	}

	public void setSalarioComBonus(double salarioComBonus) {
		this.salarioComBonus = getSalario() + geraBonificacao() ;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
