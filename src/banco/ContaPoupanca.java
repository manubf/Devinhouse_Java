package banco;

public class ContaPoupanca {
	Cliente titular = new Cliente("","","");
	private double saldo;
	static double taxaDeJurosAnual;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double calcularJurosMensal() {
		double ganhoJuros = this.saldo * (ContaPoupanca.taxaDeJurosAnual/12);
		return this.saldo = this.getSaldo() + ganhoJuros;
	}

	public static void alterarTaxaDeJurosAnual(double taxaDeJurosAnual) {
		ContaPoupanca.taxaDeJurosAnual = taxaDeJurosAnual;
	}

}
