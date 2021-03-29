package funcionarios;

public class GerenteRegional extends Gerente {

	public GerenteRegional(String nome, String sobrenome, double salario, String cpf) {
		super(nome, sobrenome, salario, cpf);
	}
	
	@Override
	public double geraBonificacao() {
		return this.bonificacao = (getSalario()*0.10) + 1000;
	}

}
