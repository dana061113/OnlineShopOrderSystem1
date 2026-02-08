package payments;

public class BankTransferPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Банковский перевод: " + amount + " тг");
    }
}
