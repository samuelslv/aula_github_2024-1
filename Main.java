import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
=======

>>>>>>> f2fab487c061b2487589b6b065901147c32a35eb
        int opcao = 0;

        do {

<<<<<<< HEAD

            // Exibe o menu principal usando a classe Menu
            Menu mainMenu = new Menu("Menu Principal",
                    Arrays.asList("Conta", "Cliente", "Realizar Operações", "Mostrar clientes", "Sair"));
=======
            // Exibe o menu principal usando a classe Menu
            Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Realizar Operações", "Mostrar clientes", "Sair"));
>>>>>>> f2fab487c061b2487589b6b065901147c32a35eb
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
<<<<<<< HEAD
=======

>>>>>>> f2fab487c061b2487589b6b065901147c32a35eb
                        System.out
                                .print("Cliente não encontrado. Deseja criar um novo cliente para criar a conta? (s/n): ");
                        String criarNovoCliente = scanner.next();
                        scanner.nextLine(); // Consome a quebra de linha

                        if (criarNovoCliente.equalsIgnoreCase("s")) {
                            Cliente novoCliente = new Cliente();
                            clientes.add(novoCliente.criarCliente());
                        } else {
                            System.out.println("Operação cancelada.");
                        }
                    }
                    break;

                case 2:
                    // Menu Cliente usando MenuCliente
<<<<<<< HEAD
                    MenuCliente menuCliente = new MenuCliente("Menu Cliente",
                            Arrays.asList("Criar cliente", "Excluir cliente"));
=======
                    MenuCliente menuCliente = new MenuCliente("Menu Cliente", Arrays.asList("Criar cliente", "Excluir cliente"));
>>>>>>> f2fab487c061b2487589b6b065901147c32a35eb
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
<<<<<<< HEAD

=======
>>>>>>> f2fab487c061b2487589b6b065901147c32a35eb
                    break;
                case 5:
                    System.out.println("SAIR");

                    break;

            }
        } while (opcao != 5);

<<<<<<< HEAD
    }
}
=======
    }
>>>>>>> f2fab487c061b2487589b6b065901147c32a35eb
