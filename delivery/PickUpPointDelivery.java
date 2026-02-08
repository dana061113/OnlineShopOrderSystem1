package delivery;

import models.Order;

public class PickUpPointDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Заказ готов к самовывозу.");
    }
}
