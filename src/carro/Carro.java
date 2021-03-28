package carro;

public class Carro {
	String cor;
	String modelo;
	boolean ligado;
	int velocidadeAtual;
	int velocidadeMaxima;
	
	boolean ligar () {
		if(!this.ligado) {
			this.ligado = true;
			return true;
		}else
			return false;
	}
	
	boolean desligar () {
		if(this.ligado) {
			this.ligado = false;
//			for (this.velocidadeAtual > 0) {
//				this.velocidadeAtual -= 10
//			}
			return true;
		}else
			return false;
	}
	
	boolean acelerar(int velocidadeAdicional) {
		if(!this.ligado) {
			return false;
		}
		if((this.velocidadeAtual + velocidadeAdicional) >= this.velocidadeMaxima) {
			this.velocidadeAtual = this.velocidadeMaxima;
		}else {
			this.velocidadeAtual += velocidadeAdicional;
		}
		return true;
	}
	
	boolean frear(int velocidadeDecremental) {
		if(!this.ligado) {
			return false;
		}
		if((this.velocidadeAtual - velocidadeDecremental) <= 0) {
			this.velocidadeAtual = 0;
		}else {
			this.velocidadeAtual -= velocidadeDecremental;
		}
		return true;
	}
	
	void buzinar() {
		System.out.print("BIBIIIIIIII");
	}

}
