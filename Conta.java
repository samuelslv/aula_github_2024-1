import java.util.Random;
import java.util.Scanner;

public class Conta {
    Random gerador = new Random();
    int numeroDaConta =  gerador.nextInt(101);
    private String agencia = "021";
    private String tipoConta = "PF";
    private String numeroConta = String.valueOf(numeroDaConta);
    private String CPF;
    private float saldo = 0;

    

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    public Conta() {

    }

    public Conta(String agencia, String tipoConta, String numeroConta, String CPF) {
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.CPF = CPF;
    }

    

    public Conta criarConta(String cpfCliente) {
        //Scanner s = new Scanner(System.in);
        //System.out.println("Insira seu CPF:");
        //String CPF = s.nextLine();
        this.CPF = cpfCliente;

        return new Conta(agencia, tipoConta,numeroConta,cpfCliente);
    }

    public void Sacar(float valor){
        if (getSaldo() < valor){
            System.out.println("saldo menor que o saque");
        }else{
            setSaldo(getSaldo() - valor);
        }
    }

    public void Depositar(float valor){
        setSaldo(getSaldo() + valor);
    }

}