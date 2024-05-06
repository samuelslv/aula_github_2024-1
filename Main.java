import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Cliente> Clientes = new ArrayList<>();
		int op;
		Scanner s = new Scanner(System.in);
		do {
			Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Realizar Operacoes", "Sair"));
			op = mainMenu.getSelection();
			switch (op) {
				case 1:
					pesquisar cliente
						se existir:
							criar Conta
						se nao:
							Ou nao criar conta ou criar cliente para criar conta

					break;
				case 2:
					MenuCliente MenuCliente = new MenuCliente("Menu Cliente", Arrays.asList("Criar cliente", "Excluir cliente"));
					int x = MenuCliente.getSelection();
					if (x==1){
						Cliente obj = new Cliente(null, null, null);
						Clientes.add(obj.criarConta());	
					}else{
						// Se excluir cliente
					}
					
					break;
				case 3:
					Selecionar qual tipo de operação, Depostio ou Saque:
					Se deposito:
						Realizar deposito
					Se saque:
						verificar se valor vai negativar o saldo, se sim, nao realizar

					break;
				case 4:
					System.out.println("SAIR");

					break;
				case 5:

					break;
				case 6:

					break;

				default:
					break;

			}
		} while (op != 4);

		int i = 1;
		for (Cliente cliente1 : Clientes) {
			System.out.println("\nCliente #" + i++);
			System.out.println(cliente1.getNome());
			System.out.println(cliente1.getCpf());
			System.out.println(cliente1.getGenero());
		}
		//System.out.println("Fim");
	}

}