package com.kartService.data.user.consumer;

import java.util.Map;

import com.kartService.data.order.Order;
import com.kartService.services.order.payment.PaymentServiceInterface;

public interface ConsumableInterface {
    void placeOrder(Order order);
    Map<Long, Order> getOrders();
    Order getOrder(Long orderId);

    boolean paymentCheckout(float amount);

    void setPaymentService(PaymentServiceInterface paymentService);
}
