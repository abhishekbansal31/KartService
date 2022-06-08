package data.user.distributor;

import java.util.Map;

import data.item.ItemCost;
import data.order.Order;
import data.user.UserInterface;

public interface DistributorItemOrderInterface extends UserInterface {
    Map<Long,ItemCost> getItems();

    void addItem(ItemCost item);
    void updateItem(ItemCost item);
    void deleteItem(ItemCost item);
    
    void placeOrder(Order order);
    Map<Long,Order> getOrders();
}
