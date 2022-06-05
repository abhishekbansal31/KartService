package data.order;

import java.util.List;

import data.distributor.DistributorItemOrderInterface;
import data.item.ItemCostInterface;
import data.order.Order.STATUS;

public interface OrderInterface {
    long getId();
    long getUserId();
    long getDistributorId();
    STATUS getStatus();
    void updateStatus(STATUS status);
    
    List<ItemCostInterface> getItems();

    float getTotalAmount();
    float getDiscountedAmount();
    void placeOrder(DistributorItemOrderInterface distributor);
}
