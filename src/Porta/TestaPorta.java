package Porta;

public class TestaPorta {

	public static void main(String[] args) {
		Porta portaCasa = new Porta();
		portaCasa.altura = 2.10;
		portaCasa.largura = 0.8;
		portaCasa.cor = "azul";
		
		System.out.printf("A porta da casa está %s e é da cor %s, medindo %.2f de altura por %.2f de largura.%n",
				portaCasa.isAbertaAsString(), portaCasa.cor, portaCasa.altura, portaCasa.largura);
		
		portaCasa.abre();
		
		portaCasa.pinta("preta");

		System.out.printf("A porta da casa está %s e é da cor %s, medindo %.2f de altura por %.2f de largura.%n",
				portaCasa.isAbertaAsString(), portaCasa.cor, portaCasa.altura, portaCasa.largura);
		
		portaCasa.fecha();
		portaCasa.pinta("vermelha");

		System.out.printf("A porta da casa está %s e é da cor %s, medindo %.2f de altura por %.2f de largura.%n",
				portaCasa.isAbertaAsString(), portaCasa.cor, portaCasa.altura, portaCasa.largura);
		
		
		
		
		
	}

}
