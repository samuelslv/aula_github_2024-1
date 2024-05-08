import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int proximoNumeroConta = 1000;
        String cpfBusca;
        
        do {

            // Exibe o menu principal usando a classe Menu
            Menu mainMenu = new Menu("Menu Principal",
                    Arrays.asList("Conta", "Cliente", "Realizar Operações", "Mostrar clientes", "Criar Conta", "Sair"));
            opcao = mainMenu.getSelection();

            switch (opcao) {
            	case 1:
            		// Operações relacionadas a Conta
            		System.out.print("Digite o CPF do cliente para procurar: ");
            		cpfBusca = scanner.next();
            		scanner.nextLine(); // Consome a quebra de linha

            		boolean clienteEncontrado = false;
            		for (Cliente cliente : clientes) {
            			// Verifica se o cliente já existe
            			if (cliente.getCpf().equals(cpfBusca)) {
            				clienteEncontrado = true;
            				System.out.println("Cliente encontrado!");

            				// Verifica se o cliente possui conta
            				if (cliente.getNumConta() == -1) {
            					System.out.println("O cliente não possui conta!");
            				} else {
            					System.out.println("O cliente possui uma conta!");
            				}
            				break;
            			}
            		}

            		if (!clienteEncontrado) {
            			System.out.println("Cliente não encontrado!");
            		}

            		break;

            	case 2:
            	    // Menu Cliente usando MenuCliente
            	    MenuCliente menuCliente = new MenuCliente("Menu Cliente", Arrays.asList("Criar cliente", "Excluir cliente"));
            	    int escolhaCliente = menuCliente.getSelection();

            	    if (escolhaCliente == 1) {
            	        System.out.print("Digite o nome do cliente: ");
            	        String nome = scanner.nextLine();
            	        System.out.print("Digite o CPF do cliente: ");
            	        String cpf = scanner.nextLine();
            	        System.out.print("Digite o gênero do cliente: ");
            	        String genero = scanner.nextLine();
            	        Cliente novoCliente = new Cliente(nome, cpf, genero);
            	        clientes.add(novoCliente);
            	        System.out.println("Cliente criado com sucesso!");
            	    } else if (escolhaCliente == 2) {
            	        System.out.print("Digite o CPF do cliente para excluir: ");
            	        String cpfExcluir = scanner.nextLine();
            	        boolean removido = clientes.removeIf(cliente -> cliente.getCpf().equals(cpfExcluir));
            	        if (removido) {
            	            System.out.println("Cliente excluído com sucesso.");
            	        } else {
            	            System.out.println("Cliente não encontrado.");
            	        }
            	    } else {
            	        System.out.println("Opção inválida.");
            	    }
            	    break;

                case 3:
                	// Solicitar o CPF do cliente para encontrar
                    System.out.print("Digite o CPF do cliente: ");
                    cpfBusca = scanner.nextLine();

                    // Encontrar o cliente com base no CPF fornecido
                    for (Cliente cliente : clientes) {
                        if (cliente.getCpf().equals(cpfBusca) && cliente.getNumConta() != -1) {
                        	// Operações Bancárias
                            Menu menuOperacoes = new Menu("Operações Bancárias", Arrays.asList("Depósito", "Saque", "Saldo"));
                            int escolhaOperacao = menuOperacoes.getSelection();

                            if (escolhaOperacao == 1) {
                                System.out.println("Depósito realizado.");
                                // Adicionar lógica de depósito aqui
                            } else if (escolhaOperacao == 2) {
                                System.out.println("Saque realizado.");
                                // Adicionar lógica de saque aqui
                            } else if (escolhaOperacao == 3) {
                            	System.out.println("Saldo: " + cliente.getSaldoConta());
                            }
                            break;
                        } else if (cliente.getCpf().equals(cpfBusca) && cliente.getNumConta() == -1){
                            System.out.println("Cliente não possui conta!");
                        } else {
                            System.out.println("Cliente não encontrado!");
                        }
                    }
                    
                    break;

                case 4:
                    int i = 1;
                    for (Cliente cliente1 : clientes) {
                        System.out.println("\nCliente #" + i++);
                        System.out.println("Nome: " + cliente1.getNome());
                        System.out.println("CPF: " + cliente1.getCpf());
                        System.out.println("Genero: " + cliente1.getGenero());
                        if (cliente1.getNumConta() == -1) {
                        	System.out.println("O cliente nao possui uma conta!");
                        } else {
                        	System.out.println("N Conta: " + cliente1.getNumConta());
                        }
                    }

                    break;
                case 5:
                    // Solicitar o CPF do cliente para encontrar
                    System.out.print("Digite o CPF do cliente para criar uma conta: ");
                    String cpfConta = scanner.nextLine();

                    // Encontrar o cliente com base no CPF fornecido
                    for (Cliente cliente : clientes) {
                        if (cliente.getCpf().equals(cpfConta)) {
                            cliente.setNumConta(proximoNumeroConta);
                            System.out.println("Conta criada com sucesso!");
                        	proximoNumeroConta++;
                            break;
                        } else {
                            System.out.println("Cliente não encontrado!");
                        }
                    }
                    break;

                case 6:
                    System.out.println("SAIR");

                    break;

            }
        } while (opcao != 6);

    }
}