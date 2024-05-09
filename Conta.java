import java.util.ArrayList;
import java.util.Random;

public class Conta {
    Random gerador = new Random();
    int numeroDaConta =  gerador.nextInt(101);
    private String agencia = "021";
    private String tipoConta = "PF";
    private String numeroConta = String.valueOf(numeroDaConta);
    private String CPF;
    private float saldo = 0;
    ArrayList<RelatorioSaque> relatorioSaque = new ArrayList<>();
    ArrayList<RelatorioDeposito> relatorioDeposito = new ArrayList<>();

    

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
        float saldoAnterior = getSaldo();
        if (getSaldo() < valor){
            System.out.println("saldo menor que o saque");
        }else{
            setSaldo(getSaldo() - valor);

            RelatorioSaque relatorio = new RelatorioSaque(this, valor, saldoAnterior, getSaldo());
            relatorioSaque.add(relatorio);
        } 
    }

    public void mostrarRelatorioSaque(){
        System.out.println("Relatorio de saques da conta " + getNumeroConta());
        if (relatorioSaque.isEmpty()){
            System.out.println("Nenhum saque realizado.");
        } else {
            for (RelatorioSaque relatorioSaque : relatorioSaque) {
                //System.out.println("Valor sacado: " + relatorioSaque.getValorSaque() + " //Saldo anterior: " + relatorioSaque.getSaldoAnterior() + " //Saldo atual: " + relatorioSaque.getSaldoAtual() + " //Hora do saque: " + relatorioSaque.getHoraSaque());
                System.out.println("Data do saque: " + relatorioSaque.getHoraSaque());
                System.out.println("Saldo anterior: " + relatorioSaque.getSaldoAnterior());
                System.out.println("Valor sacado: " + relatorioSaque.getValorSaque());
                System.out.println("Saldo final: " + relatorioSaque.getSaldoFinal());
                System.out.println("---------------------------------------------------");
            }
        }
        
    }

    public void Depositar(float valor){
        float saldoAnterior = getSaldo();
        setSaldo(getSaldo() + valor);
        RelatorioDeposito relatorio = new RelatorioDeposito(this, valor, saldoAnterior, getSaldo());
        relatorioDeposito.add(relatorio);
    }

    public void mostrarRelatorioDeposito(){
        System.out.println("Relatorio de depositos da conta " + getNumeroConta());
        if (relatorioDeposito.isEmpty()){
            System.out.println("Nenhum deposito realizado.");
        } else {
            for (RelatorioDeposito relatorioDeposito : relatorioDeposito) {
                //System.out.println("Valor depositado: " + relatorioDeposito.getvalorDeposito() + " //Saldo anterior: " + relatorioDeposito.getSaldoAnterior() + " //Saldo atual: " + relatorioDeposito.getSaldoFinal() + " //Hora do deposito: " + relatorioDeposito.gethoraDeposito());
                System.out.println("Data do deposito: " + relatorioDeposito.gethoraDeposito());
                System.out.println("Saldo anterior: " + relatorioDeposito.getSaldoAnterior());
                System.out.println("Valor depositado: " + relatorioDeposito.getvalorDeposito());
                System.out.println("Saldo final: " + relatorioDeposito.getSaldoFinal());
                System.out.println("---------------------------------------------------");
            }
        }
        
    }

}