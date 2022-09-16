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
    
    Map<Long,Order> getOrders();
    Order getOrder(Long orderId);
    void placeOrder(Order order);

    void setItemService(ItemServiceInterface service);  // the service can be changed if the distributor becomes a prime or 5 star distributor
}
