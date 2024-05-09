public class Transacao {
    private int tipo; // 1 = saque, 2 = depósito
    private double  valor;

    public Transacao(int tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    public int getTipo(){
        return tipo;
    }
    public double getValor(){
        return valor;
    }
}