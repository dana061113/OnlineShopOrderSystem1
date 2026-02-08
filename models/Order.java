package models;

import payments.IPayment;
import delivery.IDelivery;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.getTotalPrice();
        }
        return sum;
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(IDelivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public IPayment getPaymentMethod() {
        return paymentMethod;
    }

    public IDelivery getDeliveryMethod() {
        return deliveryMethod;
    }
}
