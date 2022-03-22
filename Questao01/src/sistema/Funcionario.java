package sistema;

public class Funcionario extends Pessoa {
	private double salario;

	public Funcionario(String nome, String cpf, String dataNascimento, double salario) {
		super(nome, cpf, dataNascimento);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double Salario() {

		return getSalario();
	}

}
