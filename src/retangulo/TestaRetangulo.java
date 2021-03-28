package retangulo;

public class TestaRetangulo {

	public static void main(String[] args) {
		Retangulo retaTest = new Retangulo(10.2 , 5);
		
		System.out.printf("Retangulo com %.2f de comprimento, e %.2f de largura, com área de %.2f , e perimetro de %.2f.",
				retaTest.getComprimento(), retaTest.getLargura(), retaTest.calculaArea(), retaTest.calculaPerimetro() );
	}

}
