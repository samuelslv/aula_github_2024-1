import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayList<Cliente> Clientes = new ArrayList<>();
		int op;
		do {
			Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Realizar Operacoes", "Sair"));
			op = mainMenu.getSelection();
			switch (op) {
				case 1:

					break;
				case 2:
					Cliente obj = new Cliente(null, null, null);
					Clientes.add(obj.criarConta());
					break;
				case 3:

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
		System.out.println("Fim");
	}

}