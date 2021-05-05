package shoppingCart;

import java.sql.SQLOutput;

public class TrueMoneyStrategy implements PaymentStrategy{
    private String tel;
    private String password;

    public TrueMoneyStrategy(String tel, String password) {
        this.tel = tel;
        this.password = password;
    }

    @Override
    public void pay(int total) {
        System.out.println("trueMoney");
        System.out.println("tel: "+tel);
        System.out.println("total: "+total);
        System.out.println("--------------");
    }
}
