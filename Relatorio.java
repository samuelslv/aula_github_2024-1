import java.util.ArrayList;

public class Relatorio {

    public static void RelatorioDeSaqueCliente(Cliente cl) {
        ArrayList<Transacao> transacoes = cl.getTransacoes();
        System.out.println("Relatório de Saques do Cliente: " + cl.getNome());
        for (Transacao t : transacoes) {
            if (t.getTipo() == 1) {
                System.out.println("Valor: " + t.getValor());
            }
        }
    }

    public static void RelatorioDeDepositoCliente(Cliente cl) {
        ArrayList<Transacao> transacoes = cl.getTransacoes();
        System.out.println("Relatório de Depósitos do Cliente: " + cl.getNome());
        for (Transacao t : transacoes) {
            if (t.getTipo() == 2) {
                System.out.println("Valor: " + t.getValor());
            }
        }              
    }

    public static void RelatorioGeral(Cliente cl){
        ArrayList<Transacao> transacoes = cl.getTransacoes();
        System.out.println("Relatório Geral do Cliente: " + cl.getNome());
        for (Transacao t : transacoes) {
            if (t.getTipo() == 1) {
                System.out.println("Saque: " + t.getValor());
            } else if (t.getTipo() == 2){
                System.out.println("Depósito: " + t.getValor());
            } else {
                System.out.println("Tipo de transação inválido");
            }
        }
    }


}
