package JavaBank;

import java.util.Random;

public class Conto {
    private int numeroConto;
    private String nomeProprietario;
    private double saldo;

    //Costrutto nuovo conto
    public Conto(String nomeProprietario) {
        this.numeroConto = generateRandomAccountNumber();
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0.0;
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

    public double getSaldo() {
        return saldo;
    }

}
