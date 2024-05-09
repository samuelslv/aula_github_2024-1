import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String genero;
    private String CPF;
    private double saldo;
    private ArrayList<Transacao> transacoes;

    public Cliente() {
        
    }

    public Cliente(String nome, String cpf, String genero) {
        this.CPF = cpf;
        this.genero = genero;
        this.nome = nome;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<Transacao>();
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

    private double getSaldo(){
        return this.saldo;
    }

    public ArrayList<Transacao> getTransacoes(){
        return this.transacoes;
    }

    private void setTransacoes(ArrayList<Transacao> transacoes){
        this.transacoes = transacoes;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean deposito (double valor){
        if (valor <0) {
            return false;
        }
        this.setSaldo(this.getSaldo()+valor);
        Transacao transacaoDeposito = new Transacao(2, valor);
        this.transacoes.add(transacaoDeposito);
        return true;
    }

    public boolean saque (double valor){
        if (valor <0) {
            return false;
        }
        if (valor> this.getSaldo()) {
            return false;
        }
        this.setSaldo(this.getSaldo()-valor);

        Transacao transacaoSaque = new Transacao(1, valor);
        this.transacoes.add(transacaoSaque);

        return true;
    }
    

    public Cliente criarConta() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        String nome = s.nextLine();
        System.out.println("Insira seu genero:");
        String genero = s.nextLine();
        System.out.println("Insira seu CPF:");
        String CPF = s.nextLine();

        return new Cliente(nome, genero, CPF);
    }
}