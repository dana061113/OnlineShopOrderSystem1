package delivery;

import models.Order;

public class PostDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Доставка почтой выполнена.");
    }
}
