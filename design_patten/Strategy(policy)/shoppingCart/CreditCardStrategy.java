package shoppingCart;

import java.sql.SQLOutput;

public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int total) {
        System.out.println("CreditCard");
        System.out.println("name: "+name);
        System.out.println("card number: "+cardNumber);
        System.out.println("total: "+total);
        System.out.println("---------------");
    }
}
