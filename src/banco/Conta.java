package banco;

public class Conta {
	Cliente titular = new Cliente("","","");
	int numeroConta;
	int agencia;
	double saldo;
	double limite;
	String dataAbertura;
	private static int totalContas;
	int identificador;
	
	Conta() {
		geradorDeTotalContasEIdentificador();
	}

	Conta(double saldoInicial) {
		this.saldo = saldoInicial;
		geradorDeTotalContasEIdentificador();
	}

	Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
		this.titular.nome = nomeTitular;
		this.titular.sobrenome = sobrenomeTitular;
		this.titular.cpf = cpfTitular;
		geradorDeTotalContasEIdentificador();
	}

	Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular, double saldoInicial) {
		this(nomeTitular, sobrenomeTitular, cpfTitular);
		this.saldo = saldoInicial;
	}

	boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	void depositar(double valor) {
		this.saldo += valor;
	}

	double getSaldo() {
		return this.saldo;
	}
	
	boolean transferir(Conta destino, double valor) {
		if (this.sacar(valor)){
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public void recuperaDadosImpressao () {
		System.out.printf("Cliente: %s %s, cpf: %s, desde o dia %s, posssui a conta: %n%d, agencia: %d, com saldo de %.2f, e limite de %.2f. Identificador: %d, total de contas: %d.%n", 
				this.titular.nome, this.titular.sobrenome, this.titular.cpf, this.dataAbertura, this.numeroConta, this.agencia, this.saldo, this.limite, this.identificador, Conta.totalContas);
	}

	public static int getTotalContas() {
		return totalContas;
	}

	public static void setTotalContas(int totalContas) {
		Conta.totalContas = totalContas;
	}
	
	public void geradorDeTotalContasEIdentificador() {
		Conta.setTotalContas(Conta.getTotalContas() + 1);
		this.identificador = getTotalContas();
	}
	
}
