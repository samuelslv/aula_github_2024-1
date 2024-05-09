import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Conta> contas = new ArrayList<>();
		int opcao = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			// Exibe o menu principal usando a classe Menu
			Menu mainMenu = new Menu("Menu Principal",
					Arrays.asList("Conta", "Cliente", "Realizar Operações", "Mostrar Contas", "Relatorio Saque", "Sair"));
			opcao = mainMenu.getSelection();

			switch (opcao) {
				case 1: // CONTA
					// Operações relacionadas a Conta
					System.out.print("Digite o CPF do cliente para procurar: ");
					String cpfCliente = scanner.next();
					scanner.nextLine(); // Consome a quebra de linha

					// saber se CPF é cliente
					boolean clienteEncontrado = false;
					for (Cliente cliente : clientes) {
						// Verifica se o cliente já existe
						if (cliente.getCpf().equals(cpfCliente)) {
							clienteEncontrado = true;
							System.out.println("Cliente encontrado!");

							// Verifica se o cliente possui conta
							if (cliente.getConta()) {
								System.out.println("O cliente possui conta!");

							} else {
								System.out.println("O cliente não possui uma conta!");
								Conta novaConta = new Conta();
								System.out.println("Criando conta para o cliente");
								novaConta.criarConta(cpfCliente);
								cliente.setConta(true);
								contas.add(novaConta);

							}
							break;
						}
					}

					if (!clienteEncontrado) {
						System.out.println("Cliente não encontrado!");
					}

					/*
					 * boolean fazerConta = true;
					 * for (Conta conta : contas) {
					 * //System.out.println("Numero do CPF" + cliente.getCpf());
					 * if (conta.getCpf().equals(cpfCliente)) {
					 * //novaConta = conta;
					 * System.out.println("Cliente ja tem conta");
					 * fazerConta = false;
					 * break;
					 * }
					 * }
					 * 
					 * if (fazerConta == true) {
					 * // Lógica para criar ou gerenciar contas existentes
					 * Conta novaConta = new Conta();
					 * System.out.println("Criando conta para o cliente");
					 * novaConta.criarConta(cpfCliente);
					 * contas.add(novaConta);
					 * } else {
					 * System.out.println("Conta já existente para este cliente.");
					 * 
					 * /*System.out
					 * .print("Cliente não tem conta. Deseja criar uma nova Conta? (s/n): ");
					 * String criarNovoCliente = scanner.next();
					 * scanner.nextLine(); // Consome a quebra de linha
					 * 
					 * if (criarNovoCliente.equalsIgnoreCase("s")) {
					 * novaConta.criarConta(cpfCliente);
					 * contas.add(novaConta);
					 * } else {
					 * System.out.println("Operação cancelada.");
					 * }
					 */
					// }
					break;

				case 2: // CLIENTE
					// Menu Cliente usando MenuCliente
					MenuCliente menuCliente = new MenuCliente("Menu Cliente",
							Arrays.asList("Criar cliente", "Excluir cliente"));
					int escolhaCliente = menuCliente.getSelection();

					if (escolhaCliente == 1) {
						Cliente novoCliente = new Cliente();
						clientes.add(novoCliente.criarCliente());
					} else if (escolhaCliente == 2) {
						System.out.print("Digite o CPF do cliente para excluir: ");
						String cpfExcluir = scanner.nextLine();
						clientes.removeIf(cliente -> cliente.getCpf().equals(cpfExcluir));
						System.out.println("Cliente excluído, se presente.");
					}
					break;

				case 3: // REALIZAR OPERAÇÕES
					MenuOperacoes menuOperacoes = new MenuOperacoes("Menu Operacoes",
							Arrays.asList("Depositar", "Sacar"));
					int op = menuOperacoes.getSelection();

					switch (op) {
						case 1:

							System.out.print("Digite o CPF do cliente para depositar: ");
							String cpfConta = scanner.next();
							scanner.nextLine(); // Consome a quebra de linha

							for (Conta conta : contas) {
								// System.out.println("Numero do CPF" + cliente.getCpf());
								if (conta.getCPF().equals(cpfConta)) {
									// novaConta = conta;
									System.out.println("Realizar deposito");
									System.out.print("Digite o valor para depositar: ");
									String valor = scanner.next();
									scanner.nextLine(); // Consome a quebra de linha

									conta.Depositar(Float.valueOf(valor));

									break;
								}
							}

							/*
							 * clienteExistente = null;
							 * for (Cliente cliente : clientes) {
							 * if (cliente.getCpf().equals(cpfConta)) {
							 * ClienteExistente = cliente;
							 * break;
							 * }
							 * }
							 */

							break;

						case 2:
							System.out.print("Digite o CPF do cliente para sacar: ");
							cpfConta = scanner.next();
							scanner.nextLine(); // Consome a quebra de linha

							for (Conta conta : contas) {
								// System.out.println("Numero do CPF" + cliente.getCpf());
								if (conta.getCPF().equals(cpfConta)) {
									// novaConta = conta;
									System.out.println("Realizar saque");
									System.out.print("Digite o valor para sacar: ");
									String valor = scanner.next();
									scanner.nextLine(); // Consome a quebra de linha

									conta.Sacar(Float.valueOf(valor));

									break;
								}
							}
							break;

						default:
							break;
					}

					break;

				case 4:
					System.out.println("MOSTAR CONTAS");
					for (Conta conta : contas) {
						// System.out.println("Numero do CPF" + cliente.getCpf());
						System.out.println("Agencia: " + conta.getAgencia());
						System.out.println("Tipo de conta: " + conta.getTipoConta());
						System.out.println("Numero da conta: " + conta.getNumeroConta());
						System.out.println("CPF: " + conta.getCPF());
						System.out.println("Saldo: " + conta.getSaldo());
						System.out.println();
					}
					break;

				case 5:
					System.out.println("Insira o CPF do cliente para mostrar o relatório de saque: ");
					String cpf = scanner.next();
					scanner.nextLine(); // Consome a quebra de linha

					boolean contaEncontrada = false;
					for (Conta conta : contas) {
						if (conta.getCPF().equals(cpf)) {
							contaEncontrada = true;
						}
					}

					if (contaEncontrada) {
						for (Conta conta : contas) {
							if (conta.getCPF().equals(cpf)) {
								conta.mostrarRelatorioSaque();
								break;
							}
						}
					} else {
						System.out.println("Conta não encontrada.");
					}


				case 6:

					break;

			}
		} while (opcao != 6);

	}
}