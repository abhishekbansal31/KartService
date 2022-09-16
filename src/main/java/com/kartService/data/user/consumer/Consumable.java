package com.kartService.data.user.consumer;

import java.util.Map;

import com.kartService.data.order.Order;
import com.kartService.data.user.UserAbstract;
import com.kartService.services.order.payment.PaymentServiceInterface;

public abstract class Consumable extends UserAbstract implements ConsumableInterface {

    private Map<Long, Order> orders;
    private PaymentServiceInterface paymentService;

    @Override
    public final Map<Long, Order> getOrders() {
        return orders;
    }

    protected final void setOrders(Map<Long, Order> orders) {
        this.orders = orders;
    }

    @Override
    public Order getOrder(Long orderId) {
        return getOrders().get(orderId);
    }

    @Override
    public boolean paymentCheckout(float amount) {
        return getPaymentService().checkout(this.getKart(), amount);
    }

    @Override
    public void placeOrder(Order order) {
        orders.put(order.getId(), order);
    }

    private PaymentServiceInterface getPaymentService() {
        return paymentService;
    }

    @Override
    public void setPaymentService(PaymentServiceInterface paymentService) {
        this.paymentService = paymentService;
    }
    
}
