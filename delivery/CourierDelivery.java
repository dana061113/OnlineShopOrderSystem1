package delivery;

import models.Order;

public class CourierDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Доставка курьером выполнена.");
    }
}
