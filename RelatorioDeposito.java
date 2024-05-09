
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RelatorioDeposito {
    private Conta conta;
    private float valorDeposito;
    // private String dataSaque;
    private float saldoAnterior;
    private float saldoFinal;
    private LocalDateTime horaDeposito;


    public RelatorioDeposito(Conta conta, float valorDeposito, float saldoAnterior, float saldoFinal) {
        this.conta = conta;
        this.valorDeposito = valorDeposito;
        this.saldoAnterior = saldoAnterior;
        this.saldoFinal = saldoFinal;
        this.horaDeposito = LocalDateTime.now();
    }

   public Conta getConta(){
         return conta;
   }

   public float getvalorDeposito(){
         return valorDeposito;
   }

   public float getSaldoAnterior(){
         return saldoAnterior;
   }

    public float getSaldoFinal(){
        return saldoFinal;
    }

    public String gethoraDeposito(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return horaDeposito.format(formatter);
    }

    
}