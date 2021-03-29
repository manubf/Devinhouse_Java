package funcionarios;

public class testaFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Joao", "Silva", 1500.00,"");
		Funcionario func2 = new Funcionario("Lucas", "Prestes", 3000.00,"");
		Funcionario func3 = new Funcionario("Maria", "Lucas", 1000.00,"");
		
		System.out.printf("Funcionário %s %s, salário %.2f, salário anual %.2f.%n", 
				func1.getNome(), func1.getSobrenome(), func1.getSalario(), func1.getsalarioAnual());
		System.out.printf("Funcionário %s %s, salário %.2f, salário anual %.2f.%n",
				func2.getNome(), func2.getSobrenome(), func2.getSalario(), func2.getsalarioAnual());
		System.out.printf("Funcionário %s %s, salário %.2f, salário anual %.2f.%n",
				func3.getNome(), func3.getSobrenome(), func3.getSalario(), func3.getsalarioAnual());
		
		func1.setAumento(0.05);
		func2.setAumento(0.5);
		func3.setAumento(0.1);
		
		System.out.printf("Funcionário %s %s, salário %.2f, salário anual %.2f.%n", 
				func1.getNome(), func1.getSobrenome(), func1.getSalario(), func1.getsalarioAnual());
		System.out.printf("Funcionário %s %s, salário %.2f, salário anual %.2f.%n",
				func2.getNome(), func2.getSobrenome(), func2.getSalario(), func2.getsalarioAnual());
		System.out.printf("Funcionário %s %s, salário %.2f, salário anual %.2f.%n",
				func3.getNome(), func3.getSobrenome(), func3.getSalario(), func3.getsalarioAnual());

	}

}
