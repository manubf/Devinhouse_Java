package funcionarios;

public class Gerente extends Funcionario {
	private int senha;
	protected int numeroFuncionariosGerenciados;

	public Gerente(String nome, String sobrenome, double salario, String cpf) {
		super(nome, sobrenome, salario, cpf);
		
	}

	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroFuncionariosGerenciados() {
		return this.numeroFuncionariosGerenciados;
	}

	public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}

	@Override
	public double geraBonificacao() {
		return this.bonificacao = getSalario()*0.15;
	}
	
}
