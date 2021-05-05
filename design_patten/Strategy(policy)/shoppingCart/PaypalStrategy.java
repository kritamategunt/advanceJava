package shoppingCart;

public class PaypalStrategy implements PaymentStrategy{
    private String email;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int total) {
        System.out.println("Paypal");
        System.out.println("email: "+email);
        System.out.println("Total: "+total);
        System.out.println("--------------");
    }
}
