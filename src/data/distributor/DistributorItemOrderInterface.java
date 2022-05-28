package data.distributor;

import java.util.Map;

import data.item.ItemCost;
import data.order.OrderInterface;

public interface DistributorItemOrderInterface {
    Map<Long,ItemCost> getItems();

    void addItem(ItemCost item);
    void updateItem(ItemCost item);
    void deleteItem(ItemCost item);
    
    void placeOrder(OrderInterface order);
    Map<Long,OrderInterface> getOrders();
}
