package perfilSaude;

import java.util.Scanner;

public class TestaPerfilSaude {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = input.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = input.nextLine();
		System.out.println("Qual a sua data de nascimento (favor digitar o formato:dd/mm/aaaa?");
		String dataNascimento = input.nextLine();
		System.out.println("Qual o seu sexo");
		String sexo = input.nextLine();
		System.out.println("Qual a sua altura?(favor colocar em metros, ex: 1,43)");
		double altura= input.nextDouble();
		input.nextLine();
		System.out.println("Qual o seu peso?");
		int peso = input.nextInt();
		
		
		PacientePerfilDeSaude siclano = new PacientePerfilDeSaude(nome, sobrenome, dataNascimento, sexo, altura, peso);
		
		System.out.printf("%s %s %d anos, frequencia cardíaca máxima:%d,"
				+ " como ideal sendo o intervalo entre %d e %d.%nSeu peso é %d, e altura: %.2f, com seu imc: %.2f.",
				siclano.getNome(), siclano.getSobrenome(), siclano.getIdade(), siclano.getFrequenciaCardiacaMaxima(), siclano.getMaximoAlvo(), 
				siclano.getMinimoAlvo(), siclano.getPeso(), siclano.getAltura(), siclano.getImc());
		
		
		input.close();
	}

}
