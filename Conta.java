public class Conta {
    private int numeroConta = -1;
    private double saldo = 0.0;
    //private int numeroIni; // deve ser atributo da main

    // Construtor da conta
    // A conta começa com os parametros zerados, pois o cliente pode possuir cadastro
    // mas nao necessariamente uma conta. A conta deve ser criada posteriormente.
    // O numero inicial deve ser passado como parametro
    public Conta() { 
    }

    // Getter para o numero da conta
    public int getNumero() {
        return numeroConta;
    }

    // Getter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Setter para o numero da conta
    public void setNumConta(int proximoNumeroConta) {
    	this.numeroConta = proximoNumeroConta;    	
    }
    
    
    public boolean depositar(double valor) {
    	if(valor < 0) {
    		System.out.println("Valor invalido!");
    		return false;
    	}
    	
    	this.saldo += valor;
    	return true;
    }

    public boolean saque(double valor) {
    	if(valor <= 0) {
    		System.out.println("Valor invalido!");
    		return false;
    	}
    	
    	if(this.saldo < valor) {
    		System.out.println("Saldo insuficente!");
    		return false;
    	}
    	
    	this.saldo -= valor;
    	System.out.println("Saque realizado com sucesso!");
    	return true;
    }
}