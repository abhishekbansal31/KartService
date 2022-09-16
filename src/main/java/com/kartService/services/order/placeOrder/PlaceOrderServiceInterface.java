package com.kartService.services.order.placeOrder;

import com.kartService.data.kart.KartCommercial;
import com.kartService.data.order.Order;
import com.kartService.services.order.OrderServiceInterface;

public interface PlaceOrderServiceInterface extends OrderServiceInterface {
    void placeOrder(KartCommercial kart, Order order);
}
