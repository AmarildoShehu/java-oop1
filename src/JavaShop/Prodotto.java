package JavaShop;

import java.util.Random;
public class Prodotto {

    //Atributi privati della classe
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    //costruttore nuovo progetto
    public Prodotto(String name, String description, double price, double iva) {
        //nuovo codice random per il prodotto
        this.code = generateRandomCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    private int generateRandomCode() {
        Random rand = new Random();
        return rand.nextInt(1000000);
    }
  //getter code proddotto
    public String getCode() {
        return String.format("%06d", code);
    }

    //getter e setter name ecc...
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter e setter per il campo "prezzo"
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter e setter per il campo "iva"
    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

}
