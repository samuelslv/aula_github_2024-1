
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RelatorioSaque {
    private Conta conta;
    private float valorSaque;
    // private String dataSaque;
    private float saldoAnterior;
    private float saldoFinal;
    private LocalDateTime horaSaque;


    public RelatorioSaque(Conta conta, float valorSaque, float saldoAnterior, float saldoFinal) {
        this.conta = conta;
        this.valorSaque = valorSaque;
        this.saldoAnterior = saldoAnterior;
        this.saldoFinal = saldoFinal;
        this.horaSaque = LocalDateTime.now();
    }

   public Conta getConta(){
         return conta;
   }

   public float getValorSaque(){
         return valorSaque;
   }

   public float getSaldoAnterior(){
         return saldoAnterior;
   }

    public float getSaldoFinal(){
        return saldoFinal;
    }

    public String getHoraSaque(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return horaSaque.format(formatter);
    }

    
}