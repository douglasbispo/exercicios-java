package sistema;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] Args) {
		Scanner leitor = new Scanner(System.in);

		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Funcionario funcionario = null;
		Gerente gerente = null;
		/* Pessoa pessoa = null; */

		int menu = 0;

		do {
			System.out.println("_______________MENU_______________");
			System.out.print("Digite uma opção abaixo: \r\n" +
					"1. Adicionar Funcionário\r\n" +
					"2. Adicionar Gerente\r\n" +
					"3. Obter salário de Funcionário\r\n" +
					"4. Obter salário Gerente\r\n" +
					"0. Sair: ");
			menu = leitor.nextInt();
			System.out.println("");

			switch (menu) {
				case 0:
					System.out.println("Programa encerrado!");
					break;
				case 1:
					System.out.print("Nome: ");
					String nome = leitor.next();
					System.out.print("Cpf: ");
					String cpf = leitor.next();
					System.out.print("Data de nascimento: ");
					String dataNascimento = leitor.next();
					System.out.print("Salario: ");
					double salario = leitor.nextDouble();
					System.out.println("");

					funcionario = new Funcionario(nome, cpf, dataNascimento, salario);
					listaPessoa.add(funcionario);
					break;
				case 2:
					System.out.print("Nome: ");
					nome = leitor.next();
					System.out.print("Cpf: ");
					cpf = leitor.next();
					System.out.print("Data de nascimento: ");
					dataNascimento = leitor.next();
					System.out.print("Salario: ");
					salario = leitor.nextDouble();
					System.out.print("Departamento: ");
					String departamento = leitor.next();
					System.out.println("");

					gerente = new Gerente(nome, cpf, dataNascimento, salario, departamento);
					listaPessoa.add(gerente);
					break;
				case 3:
					System.out.print("Digite o CPF do funcionário: ");
					cpf = leitor.next();
					System.out.println("");

					for (int i = 0; i < listaPessoa.size(); i++) {
						if (listaPessoa.get(i).getCpf().equals(cpf)) {

							if (listaPessoa.get(i) instanceof Funcionario) {
								funcionario = (Funcionario) listaPessoa.get(i);

								System.out.println("INFORMAÇÕES DO FUNCIONÁRIO");
								System.out.println("Nome do funcionário: " + funcionario.getNome());
								System.out.println("CPF: " + funcionario.getCpf());
								System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
								System.out.println("Salário: R$" + funcionario.Salario() + "\r\n");

							}
						}
					}
					break;
				case 4:
					System.out.print("Digite o CPF do gerente: ");
					cpf = leitor.next();
					System.out.println("");

					for (int i = 0; i < listaPessoa.size(); i++) {
						if (listaPessoa.get(i).getCpf().equals(cpf)) {

							if (listaPessoa.get(i) instanceof Gerente) {
								gerente = (Gerente) listaPessoa.get(i);

								System.out.println("INFORMAÇÕES DO GERENTE");
								System.out.println("Nome do gerente: " + gerente.getNome());
								System.out.println("CPF: " + gerente.getCpf());
								System.out.println("Data de Nascimento: " + gerente.getDataNascimento());
								System.out.println("Salário com gratificação: R$" + gerente.Salario());
								System.out.println("Departamento: " + gerente.getDepartamento() + "\r\n");

							}
						}
					}
					break;
				default:
					System.out.println("Informação inválida!\r\n");
					break;
			}

		} while (menu != 0);

		leitor.close();
	}
}
