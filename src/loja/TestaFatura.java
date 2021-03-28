package loja;

public class TestaFatura {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("123", "gato",	2, 1.99);
		Fatura fatura3 = new Fatura("126", "cachorro",	3, 5.20);
		Fatura fatura4 = new Fatura("153", "piolho",	2, 0);
		Fatura fatura5 = new Fatura("3", "pulga",	-2, 1.99);

		System.out.printf("a fatura %s, vende %s , total %.2f%n", fatura1.numero, fatura1.descricao, fatura1.getValorFatura());
		System.out.printf("a fatura %s, vende %s , total %.2f%n", fatura3.numero, fatura3.descricao, fatura3.getValorFatura());
		System.out.printf("a fatura %s, vende %s , total %.2f%n", fatura4.numero, fatura4.descricao, fatura4.getValorFatura());
		System.out.printf("a fatura %s, vende %s , total %.2f%n", fatura5.numero, fatura5.descricao, fatura5.getValorFatura());
	}

}
