import models.*;
import payments.*;
import delivery.*;
import notifications.*;
import discounts.*;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new OrderItem("Ноутбук", 1, 300000));
        order.addItem(new OrderItem("Мышка", 2, 5000));

        order.setPaymentMethod(new CreditCardPayment());
        order.setDeliveryMethod(new CourierDelivery());

        DiscountCalculator calculator = new DiscountCalculator();
        calculator.addRule(new PercentageDiscountRule(10));
        calculator.addRule(new FixedAmountDiscountRule(5000));

        double total = order.getTotalPrice();
        double finalPrice = calculator.calculate(total);

        System.out.println("Бастапқы сумма: " + total);
        System.out.println("Скидкадан кейін: " + finalPrice);

        order.getPaymentMethod().processPayment(finalPrice);
        order.getDeliveryMethod().deliverOrder(order);

        INotification notification = new EmailNotification();
        notification.sendNotification("Сіздің заказ қабылданды!");
    }
}
