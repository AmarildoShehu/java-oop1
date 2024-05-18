package JavaBank;

import java.math.BigDecimal;
import java.util.Random;

public class Conto {
    private int numeroConto;
    private String nomeProprietario;
    private BigDecimal saldo;

    //Costrutto nuovo conto
    public Conto(String nomeProprietario) {
        this.numeroConto = generateRandomAccountNumber();
        this.nomeProprietario = nomeProprietario;
        this.saldo = BigDecimal.ZERO;
    }
    //generatore numero conto casuale
    private int generateRandomAccountNumber() {
        Random random = new Random();
        return random.nextInt(1000)+1;
    }

    // Getter e setter

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    //metodo versamento
    public void versareDenaro(BigDecimal importo) {
        if (importo.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(importo);
            System.out.println("Versamento di " + importo + "€ avvenuto con successo.");
        } else {
            System.out.println("Importo non valido per il versamento.");
        }
    }

    public void prelevareDenaro(BigDecimal importo) {
        if (importo.compareTo(BigDecimal.ZERO) > 0 && saldo.compareTo(importo) >= 0) {
            saldo = saldo.subtract(importo);
            System.out.println("prelievo di " + importo + "effettuato");
        } else {
            System.out.println("impossibile prelevare saldo insufficente");
        }
    }

    //info conto
    public String getInfoConto() {
        return "Numero conto: " + numeroConto + "\n" +
                "Proprietario: " + nomeProprietario + "\n" +
                "Saldo: " + saldo.setScale(2, BigDecimal.ROUND_HALF_UP) + "€";


    }


}
