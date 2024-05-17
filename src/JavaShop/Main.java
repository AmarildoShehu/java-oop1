package JavaShop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto(
                "Telefono",
                "Samsung",
                350.00,
                22.00);

        System.out.println(prodotto);

        //dati modificati
        prodotto.setName("Laptop");
        prodotto.setDescription("Apple");
        prodotto.setPrice(1500.00);
        prodotto.setIva(25.00);

        System.out.println(prodotto);
    }
}
