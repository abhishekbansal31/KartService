package com.kartService.services.order.placeOrder;

import com.kartService.data.order.Order;
import com.kartService.data.user.distributor.Distributable;
import com.kartService.services.order.OrderServiceInterface;

public interface PlaceOrderServiceInterface extends OrderServiceInterface {
    void placeOrder(Distributable distributor, Order order);
}
