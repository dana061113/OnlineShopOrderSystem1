package payments;

public class CreditCardPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой: " + amount + " тг");
    }
}
