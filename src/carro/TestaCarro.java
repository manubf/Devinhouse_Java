package carro;

public class TestaCarro {

	public static void main(String[] args) {
		Carro fiatDaFirma = new Carro();
		fiatDaFirma.cor = "verde";
		fiatDaFirma.modelo = "Uno";
		fiatDaFirma.ligado = false;
		fiatDaFirma.velocidadeAtual = 0;
		fiatDaFirma.velocidadeMaxima = 210;
		
		System.out.printf("carro: %s, cor: %s, %b, velocidade atual: %d, velocidade máxima: %d%n", fiatDaFirma.modelo, fiatDaFirma.cor, fiatDaFirma.ligado, fiatDaFirma.velocidadeAtual, fiatDaFirma.velocidadeMaxima);
		
		fiatDaFirma.ligar();
		fiatDaFirma.acelerar(100);
		fiatDaFirma.frear(10);
		fiatDaFirma.buzinar();
		
		System.out.printf("carro: %s, cor: %s, %b, velocidade atual: %d, velocidade máxima: %d%n", fiatDaFirma.modelo, fiatDaFirma.cor, fiatDaFirma.ligado, fiatDaFirma.velocidadeAtual, fiatDaFirma.velocidadeMaxima);
		
		fiatDaFirma.frear(100);
		System.out.printf("carro: %s, cor: %s, %b, velocidade atual: %d, velocidade máxima: %d%n", fiatDaFirma.modelo, fiatDaFirma.cor, fiatDaFirma.ligado, fiatDaFirma.velocidadeAtual, fiatDaFirma.velocidadeMaxima);

		fiatDaFirma.acelerar(300);
		System.out.printf("carro: %s, cor: %s, %b, velocidade atual: %d, velocidade máxima: %d%n", fiatDaFirma.modelo, fiatDaFirma.cor, fiatDaFirma.ligado, fiatDaFirma.velocidadeAtual, fiatDaFirma.velocidadeMaxima);
		
		fiatDaFirma.desligar();
		System.out.printf("carro: %s, cor: %s, %b, velocidade atual: %d, velocidade máxima: %d%n", fiatDaFirma.modelo, fiatDaFirma.cor, fiatDaFirma.ligado, fiatDaFirma.velocidadeAtual, fiatDaFirma.velocidadeMaxima);
	}

}
