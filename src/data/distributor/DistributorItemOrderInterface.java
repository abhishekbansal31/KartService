package data.distributor;

import java.util.Map;

import data.item.ItemCostInterface;
import data.order.OrderInterface;
import services.item.ItemServiceInterface;

public interface DistributorItemOrderInterface extends DistributorInterface {
    Map<Long,ItemCostInterface> getItems();

    void addItem(ItemCostInterface item);
    void updateItem(ItemCostInterface item);
    void deleteItem(ItemCostInterface item);
    
    void placeOrder(OrderInterface order);
    Map<Long,OrderInterface> getOrders();

    ItemServiceInterface getItemService();
}
