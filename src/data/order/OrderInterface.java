package data.order;

import java.util.List;

import data.distributor.DistributorItemOrder;
import data.item.ItemCost;
import data.order.Order.STATUS;

public interface OrderInterface {
    long getId();
    long getUserId();
    long getDistributorId();
    STATUS getStatus();
    void updateStatus(STATUS status);
    
    List<ItemCost> getItems();

    float getTotalAmount();
    float getDiscountedAmount();
    void placeOrder(DistributorItemOrder distributor);
}
