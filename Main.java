import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {

            // Exibe o menu principal usando a classe Menu
            Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Realizar Operações", "Mostrar clientes", "Sair"));
            opcao = mainMenu.getSelection();

            switch (opcao) {
                case 1:
                    // Operações relacionadas a Conta
                    System.out.print("Digite o CPF do cliente para procurar: ");
                    String cpfConta = scanner.next();
                    scanner.nextLine(); // Consome a quebra de linha

                    Cliente clienteExistente = null;
                    for (Cliente cliente : clientes) {
                        if (cliente.getCpf().equals(cpfConta)) {
                            clienteExistente = cliente;
                            break;
                        }
                    }

                    if (clienteExistente != null) {
                        System.out.println("Conta já existente para este cliente.");
                        // Lógica para criar ou gerenciar contas existentes
                    } else {
                        System.out
                                .print("Cliente não encontrado. Deseja criar um novo cliente para criar a conta? (s/n): ");
                        String criarNovoCliente = scanner.next();
                        scanner.nextLine(); // Consome a quebra de linha

                        if (criarNovoCliente.equalsIgnoreCase("s")) {
                            System.out.print("Nome: ");
                            String nome = scanner.nextLine();
                            System.out.print("CPF: ");
                            String cpf = scanner.nextLine();
                            System.out.print("Gênero: ");
                            String genero = scanner.nextLine();
                            clientes.add(new Cliente(nome, cpf, genero));
                        } else {
                            System.out.println("Operação cancelada.");
                        }
                    }
                    break;

                case 2:
                    // Menu Cliente usando MenuCliente
                    MenuCliente menuCliente = new MenuCliente("Menu Cliente",
                            Arrays.asList("Criar cliente", "Excluir cliente"));
                    int escolhaCliente = menuCliente.getSelection();

                    if (escolhaCliente == 1) {
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        System.out.print("Gênero: ");
                        String genero = scanner.nextLine();
                        clientes.add(new Cliente(nome, cpf, genero));
                    } else if (escolhaCliente == 2) {
                        System.out.print("Digite o CPF do cliente para excluir: ");
                        String cpfExcluir = scanner.nextLine();
                        clientes.removeIf(cliente -> cliente.getCpf().equals(cpfExcluir));
                        System.out.println("Cliente excluído, se presente.");
                    }
                    break;

                case 3:
                    // Operações Bancárias
                    Menu menuOperacoes = new Menu("Operações Bancárias", Arrays.asList("Depósito", "Saque"));
                    int escolhaOperacao = menuOperacoes.getSelection();

                    if (escolhaOperacao == 1) {
                        System.out.println("Depósito realizado.");
                        // Adicionar lógica de depósito aqui
                    } else if (escolhaOperacao == 2) {
                        System.out.println("Saque realizado.");
                        // Adicionar lógica de saque aqui
                    }
                    break;

                case 4:
                    int i = 1;
                    for (Cliente cliente1 : clientes) {
                        System.out.println("\nCliente #" + i++);
                        System.out.println(cliente1.getNome());
                        System.out.println(cliente1.getCpf());
                        System.out.println(cliente1.getGenero());
                    }

					break;
                case 5:
					System.out.println("SAIR");

					break;

            }
        } while (opcao != 5);

    }
}
