package com.kartService.services.order.placeOrder;

import com.kartService.data.kart.KartCommercial;
import com.kartService.data.order.Order;
import com.kartService.data.order.Order.STATUS;
import com.kartService.data.user.consumer.Consumable;
import com.kartService.data.user.distributor.Distributable;

public abstract class PlaceOrderService implements PlaceOrderServiceInterface {
    public void placeOrder(KartCommercial kart, Order order) {
        try {
            if(kart!=null && order!=null &&
                   order.getDistributorId()!=0l &&
                   order.getConsumerId()!=0l &&
                   kart.getDistributor(order.getDistributorId())!=null &&
                   kart.getConsumer(order.getConsumerId())!=null) {

                Distributable distributor = kart.getDistributor(order.getDistributorId());
                Consumable consumer = kart.getConsumer(order.getConsumerId());
                
                if(distributor.getOrder(order.getId())==null && consumer.getOrder(order.getId())==null) {
                    order.updateStatus(STATUS.PLACED);
                    distributor.placeOrder(order);
                    consumer.placeOrder(order);
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
