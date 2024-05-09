public class Transacao {
    private int tipo; // 1 - Deposito, 2 - Saque
    private double valor; // Valor da transação em real

    public Transacao(int tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;

    }

    public int getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    
}
