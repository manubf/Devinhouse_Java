package frequenciaCardiaca;

import java.util.Scanner;

public class TestaFrequencia {

	public static void main(String[] args) {
		FrequenciaCardiaca fulano = new FrequenciaCardiaca();
		// fulano.nome = "alanderson";
		// fulano.sobrenome = "joao";
		// fulano.dataNascimento = "09/11/1998";
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		fulano.nome = input.nextLine();
		System.out.println("Qual o seu sobrenome?");
		fulano.sobrenome = input.nextLine();
		System.out.println("Qual a sua data de nascimento (favor digitar o formato:dd/mm/aaaa?");
		fulano.dataNascimento = input.nextLine();

		System.out.printf("%s %s %d anos, frequencia cardíaca máxima:%d, como ideal sendo o intervalo entre %d e %d",
				fulano.getNome(), fulano.getSobrenome(), fulano.getIdade(), fulano.getFrequenciaCardiacaMaxima(),
				fulano.getMaximoAlvo(), fulano.getMinimoAlvo());

		input.close();
	}

}
