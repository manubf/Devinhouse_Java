package loja;

public class Fatura {
	String numero;
	String descricao;
	int qtddItens;
	double precoItem;
	
	Fatura(String numero, String descricao,	int qtddItens, double precoItem){
		this.numero = numero;
		this.descricao = descricao;
		this.qtddItens = qtddItens;
		this.precoItem = precoItem;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtddItens() {
		return qtddItens;
	}

	public void setQtddItens(int qtddItens) {
		this.qtddItens = qtddItens;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	public double getValorFatura() {
		int quantidade = getQtddItens();
		double preco = getPrecoItem();
		double total = 0;
		if (quantidade > 0 && preco > 0) {
			total = (quantidade*preco);
			return total;
		}
		return total;
	}

}
