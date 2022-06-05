package services.order.placeOrder;

import data.distributor.DistributorItemOrder;
import data.order.Order;
import services.order.OrderServiceInterface;

public interface PlaceOrderServiceInterface extends OrderServiceInterface {
    void placeOrder(DistributorItemOrder distributor, Order order);
}
