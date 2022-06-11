package com.kartService.data.order;

import java.util.List;

import com.kartService.data.item.ItemSellable;
import com.kartService.data.order.Order.STATUS;
import com.kartService.services.order.placeOrder.PlaceOrderServiceInterface;

public interface OrderInterface {
    long getId();
    long getConsumerId();
    long getDistributorId();
    STATUS getStatus();
    void updateStatus(STATUS status);
    
    List<ItemSellable> getItems();

    float getTotalAmount();
    float getDiscountedAmount();

    PlaceOrderServiceInterface getPlaceOrderService();
    void setPlaceOrderService(PlaceOrderServiceInterface service);
}
