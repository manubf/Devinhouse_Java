package pessoaAniversario;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa emanuelle = new Pessoa();
		emanuelle.idade = 35;
		emanuelle.nome = "emanuelle";
		
		System.out.printf("%s, tem %d anos%n",emanuelle.nome, emanuelle.idade);
		emanuelle.fazAniversario();
		System.out.printf("%s, tem %d anos%n",emanuelle.nome, emanuelle.idade);
		emanuelle.fazAniversario();
		System.out.printf("%s, tem %d anos%n",emanuelle.nome, emanuelle.idade);
		emanuelle.fazAniversario();
		System.out.printf("%s, tem %d anos%n",emanuelle.nome, emanuelle.idade);
		
	}

}
