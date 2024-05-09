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

}
