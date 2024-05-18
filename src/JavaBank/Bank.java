package JavaBank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nome utente
        System.out.print("Inserisci il tuo nome");
        String nomeUtente = scanner.nextLine();

        //nuovo conto
        Conto conto = new Conto(nomeUtente);
        System.out.println("Conto creato con successo!");
        System.out.println(conto.getInfoConto());

        int scelta;

        do {
            System.out.println("\nCosa desideri fare?");
            System.out.println("1. Versare denaro");
            System.out.println("2. Prelevare denaro");
            System.out.println("3. Uscire");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Quanto denaro desideri versare? ");
                    BigDecimal importoVersamento = scanner.nextBigDecimal();
                    conto.versareDenaro(importoVersamento);
                    break;
                case 2:
                    System.out.print("Quanto denaro desideri prelevare? ");
                    BigDecimal importoPrelievo = scanner.nextBigDecimal();
                    conto.prelevareDenaro(importoPrelievo);
                    break;
                case 3:
                    System.out.println("Grazie per aver utilizzato Bank");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

            if (scelta != 3) {
                System.out.println("Saldo attuale: " + conto.getSaldo().setScale(2, RoundingMode.HALF_UP) + "€");
            }
        } while (scelta != 3);

    }
}
