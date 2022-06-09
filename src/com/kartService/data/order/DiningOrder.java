package com.kartService.data.order;

import java.util.List;

import com.kartService.data.item.ItemSellable;
import com.kartService.services.order.placeOrder.DiningPlaceOrderService;
import com.kartService.services.order.placeOrder.PlaceOrderServiceInterface;

public class DiningOrder extends Order {
    
    public DiningOrder(long userId, long distributorId, List<ItemSellable> items) {
        this(userId, distributorId, items, new DiningPlaceOrderService());
    }
    public DiningOrder(long userId, long distributorId, List<ItemSellable> items, PlaceOrderServiceInterface service) {
        this.setId(getNextId());
        this.setUserId(userId);
        this.setDistributorId(distributorId);
        this.setItems(items);
        this.setPlaceOrderService(service);
    }

    protected final PlaceOrderServiceInterface getPlaceOrderService() {
        return placeOrderService;
    }

    public final void setPlaceOrderService(PlaceOrderServiceInterface service) {
        this.placeOrderService = service;
    }
}
