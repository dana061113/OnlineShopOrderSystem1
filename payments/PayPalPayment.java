package payments;

public class PayPalPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal: " + amount + " тг");
    }
}
