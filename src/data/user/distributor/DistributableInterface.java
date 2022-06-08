package data.user.distributor;

import java.util.Map;

import data.item.ItemSellable;
import data.order.Order;

public interface DistributableInterface {
    Map<Long,ItemSellable> getItems();

    void addItem(ItemSellable item);
    void updateItem(ItemSellable item);
    void deleteItem(ItemSellable item);
    
    void placeOrder(Order order);
    Map<Long,Order> getOrders();
}
