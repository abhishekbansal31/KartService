package com.kartService.services.order.placeOrder;

import com.kartService.data.order.Order;
import com.kartService.data.order.Order.STATUS;
import com.kartService.data.user.distributor.Distributable;

public abstract class PlaceOrderService implements PlaceOrderServiceInterface {
    public void placeOrder(Distributable distributor, Order order) {
        try {
            if(distributor!=null && order!=null) {
                if(distributor.getOrders().get(order.getId())==null) {
                    order.updateStatus(STATUS.PLACED);
                    distributor.getOrders().put(order.getId(), order);
                } else {
                    throw new Exception("Order already Placed.");
                }
            } else {
                throw new Exception("Invalid Params.");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}