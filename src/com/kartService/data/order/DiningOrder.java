package com.kartService.data.order;

import java.util.List;

import com.kartService.data.item.ItemSellable;
import com.kartService.services.order.placeOrder.DiningPlaceOrderService;
import com.kartService.services.order.placeOrder.PlaceOrderServiceInterface;

public class DiningOrder extends Order {
    
    public DiningOrder(long consumerId, long distributorId, List<ItemSellable> items) {
        this(consumerId, distributorId, items, DiningPlaceOrderService.getInstance());
    }
    public DiningOrder(long consumerId, long distributorId, List<ItemSellable> items, PlaceOrderServiceInterface service) {
        this.setId(getNextId());
        this.setConsumerId(consumerId);
        this.setDistributorId(distributorId);
        this.setItems(items);
        this.setPlaceOrderService(service);
    }
}
