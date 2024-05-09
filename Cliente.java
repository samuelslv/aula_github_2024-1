import java.util.Scanner;

public class Cliente {
    private String nome;
    private String genero;
    private String CPF;
    private boolean temConta;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String genero) {
        this.CPF = cpf;
        this.genero = genero;
        this.nome = nome;
        this.temConta = false;
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo genero
    public String getGenero() {
        return genero;
    }

    // Setter para o atributo genero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getter para o atributo cpf
    public String getCpf() {
        return CPF;
    }

    // Setter para o atributo cpf
    public void setCpf(String cpf) {
        this.CPF = cpf;
    }

    // Getter para o atributo cpf
    public boolean getConta() {
        return temConta;
    }

    // Setter para o atributo cpf
    public void setConta(boolean temConta) {
        this.temConta = temConta;
    }

    public Cliente criarCliente() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        String nome = s.nextLine();
        System.out.println("Insira seu genero:");
        String genero = s.nextLine();
        System.out.println("Insira seu CPF:");
        String CPF = s.nextLine();

        return new Cliente(nome, CPF, genero);
    }
}