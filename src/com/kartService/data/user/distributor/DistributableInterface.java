package com.kartService.data.user.distributor;

import java.util.Map;

import com.kartService.data.item.ItemSellable;
import com.kartService.data.order.Order;
import com.kartService.services.item.ItemServiceInterface;

public interface DistributableInterface {
    Map<Long,ItemSellable> getItems();

    void addItem(ItemSellable item);
    void updateItem(ItemSellable item);
    void deleteItem(ItemSellable item);
    
    void placeOrder(Order order);
    Map<Long,Order> getOrders();
    void setItemService(ItemServiceInterface service);
}
