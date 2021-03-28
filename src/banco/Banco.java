package banco;

public class Banco {

	public static void main(String[] args) {

		ContaPoupanca c1 = new ContaPoupanca();
		c1.setSaldo(2000);
		c1.titular.nome = "blabla";
		c1.titular.sobrenome = "Figueiredo";
		c1.titular.cpf = "111.222.333-44";
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setSaldo(3000);
		c2.titular.nome = "blibli";
		c2.titular.sobrenome = "Figueiredo";
		c2.titular.cpf = "111.222.333-44";
		
		System.out.printf("Saldo de c1 é: %.2f %s %n", c1.getSaldo(), c1.titular.nome);
		System.out.printf("Saldo de c1 é: %.2f %s%n", c2.getSaldo(), c2.titular.nome);
		
		ContaPoupanca.alterarTaxaDeJurosAnual(0.04);
		
		for (int i = 0; i <= 12; i++) {
			c1.calcularJurosMensal();
			c2.calcularJurosMensal();
		}
				
		System.out.printf("Saldo de c1 é: %.2f %s %n", c1.getSaldo(), c1.titular.nome);
		System.out.printf("Saldo de c1 é: %.2f %s%n", c2.getSaldo(), c2.titular.nome);
		
		ContaPoupanca.alterarTaxaDeJurosAnual(0.05);
		
		c1.calcularJurosMensal();
		c2.calcularJurosMensal();
		
		System.out.printf("Saldo de c1 é: %.2f %s %n", c1.getSaldo(), c1.titular.nome);
		System.out.printf("Saldo de c1 é: %.2f %s%n", c2.getSaldo(), c2.titular.nome);		
		
		
		/*
		 *chamadas para conta:
		 * Conta c1 = new Conta(); c1.saldo = 200; c1.titular.nome = "Vitor";
		 * c1.titular.sobrenome = "Figueiredo"; c1.titular.cpf = "111.222.333-44";
		 * c1.agencia = 200; c1.numeroConta = 225566; c1.limite = 150; c1.dataAbertura =
		 * "18/05/2020";
		 * 
		 * Conta c2 = new Conta(); c2.saldo = 120; c2.titular.nome = "Emanuelle";
		 * c2.titular.sobrenome = "balblabla"; c2.titular.cpf = "100586955"; c2.agencia
		 * = 200; c2.numeroConta = 228561; c2.limite = 200; c2.dataAbertura =
		 * "22/02/2020";
		 * 
		 * c1.recuperaDadosImpressao(); c2.recuperaDadosImpressao();
		 */
		// System.out.printf("Saldo de c1 é: %.2f%n %s", c1.saldo,
		// c1.titular.sobrenome);

//			System.out.printf("O saldo atual do cliente %s é de %.2f.%n",minhaConta.
//					nomeTitular,minhaConta.saldo); System.out.print(minhaConta);
	}

}
