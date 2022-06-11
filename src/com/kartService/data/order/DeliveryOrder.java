package com.kartService.data.order;

import java.util.List;

import com.kartService.data.item.ItemSellable;
import com.kartService.services.order.placeOrder.DeliveryPlaceOrderService;
import com.kartService.services.order.placeOrder.PlaceOrderServiceInterface;

public class DeliveryOrder extends Order {
    private String deliveryAddress;

    public enum STATUS {
        PLACED,
        PROGRESS,
        DISPATCHED,
        DELIVERED
    }

    public DeliveryOrder(long consumerId, long distributorId, List<ItemSellable> items, String deliveryAddress) {
        this(consumerId, distributorId, items, deliveryAddress, new DeliveryPlaceOrderService());
    }
    public DeliveryOrder(long consumerId, long distributorId, List<ItemSellable> items, String deliveryAddress, PlaceOrderServiceInterface service) {
        this.setId(getNextId());
        this.setConsumerId(consumerId);
        this.setDistributorId(distributorId);
        this.setItems(items);
        this.setDeliveryAddress(this.deliveryAddress);
        this.setPlaceOrderService(service);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    private void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
}
