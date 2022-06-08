package data.order;

import java.util.List;

import data.item.ItemCost;
import data.order.Order.STATUS;
import data.user.distributor.DistributorItemOrder;

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
