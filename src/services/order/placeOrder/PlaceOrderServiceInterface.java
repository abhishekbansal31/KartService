package services.order.placeOrder;

import data.order.Order;
import data.user.distributor.Distributable;
import services.order.OrderServiceInterface;

public interface PlaceOrderServiceInterface extends OrderServiceInterface {
    void placeOrder(Distributable distributor, Order order);
}
