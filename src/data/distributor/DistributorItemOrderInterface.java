package data.distributor;

import java.util.Map;

import data.item.ItemCost;
import data.order.Order;

public interface DistributorItemOrderInterface extends DistributorInterface {
    Map<Long,ItemCost> getItems();

    void addItem(ItemCost item);
    void updateItem(ItemCost item);
    void deleteItem(ItemCost item);
    
    void placeOrder(Order order);
    Map<Long,Order> getOrders();
}
