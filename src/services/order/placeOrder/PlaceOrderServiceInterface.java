package services.order.placeOrder;

import data.distributor.DistributorItemOrderInterface;
import data.order.OrderInterface;
import services.order.OrderServiceInterface;

public interface PlaceOrderServiceInterface extends OrderServiceInterface {
    void placeOrder(DistributorItemOrderInterface distributor, OrderInterface order);
}
