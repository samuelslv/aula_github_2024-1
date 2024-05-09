public class RelatorioGeral {
    private int tipoOperacao; // 1 - Saque, 2 - Deposito
    private Conta conta;
    private RelatorioDeposito relatorioDeposito;
    private RelatorioSaque relatorioSaque;

    public RelatorioGeral(int tipoOperacao, Conta conta) {
        this.tipoOperacao = tipoOperacao;
        this.conta = conta;
    }

    public int getTipoOperacao() {
        return tipoOperacao;
    }

    public Conta getConta() {
        return conta;
    }

    public RelatorioDeposito getRelatorioDeposito() {
        return relatorioDeposito;
    }

    public void setRelatorioDeposito(RelatorioDeposito relatorioDeposito) {
        this.relatorioDeposito = relatorioDeposito;
    }

    public RelatorioSaque getRelatorioSaque() {
        return relatorioSaque;
    }

    public void setRelatorioSaque(RelatorioSaque relatorioSaque) {
        this.relatorioSaque = relatorioSaque;
    }


}