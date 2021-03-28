package banco;

public class Cliente {
	String nome;
	String sobrenome;
	String cpf;
	
	public Cliente(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = verificaCpf(cpf);
	}
	
	public String verificaCpf(String cpf) {
		return cpf;
	}
}
