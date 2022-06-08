package services.order.placeOrder;

import data.order.Order;
import data.user.distributor.DistributorItemOrder;
import services.order.OrderServiceInterface;

public interface PlaceOrderServiceInterface extends OrderServiceInterface {
    void placeOrder(DistributorItemOrder distributor, Order order);
}
