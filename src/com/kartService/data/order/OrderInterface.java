package com.kartService.data.order;

import java.util.List;

import com.kartService.data.item.ItemSellable;
import com.kartService.data.order.Order.STATUS;
import com.kartService.data.user.distributor.Distributable;
import com.kartService.services.order.placeOrder.PlaceOrderServiceInterface;

public interface OrderInterface {
    long getId();
    long getUserId();
    long getDistributorId();
    STATUS getStatus();
    void updateStatus(STATUS status);
    
    List<ItemSellable> getItems();

    float getTotalAmount();
    float getDiscountedAmount();
    void placeOrder(Distributable distributor);
    void setPlaceOrderService(PlaceOrderServiceInterface service);
}
