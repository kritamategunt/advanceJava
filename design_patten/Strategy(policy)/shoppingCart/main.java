package shoppingCart;


public class main {
    public static void main(String[] args) {
        ShoppingCart shopping = new ShoppingCart();
        shopping.addItem(new Item("Milk",12));
        shopping.addItem(new Item("Bread",20));
        shopping.addItem(new Item("Chocolate",30));
        shopping.addItem(new Item("Ham",35));
        shopping.addItem(new Item("Fried Rice",40));
        System.out.println("Total cost: " + shopping.calculateTotal() + " Baht.");
        shopping.pay(new PaypalStrategy("Gunt69", "Paint@99"));
        shopping.pay(new CreditCardStrategy("Kritamate", "123564", "422", "22/02/23"));
        shopping.pay(new TrueMoneyStrategy("0970127542", "0933264415"));
    }
}
