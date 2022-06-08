package data.order;

import java.util.List;

import data.item.ItemSellable;
import data.order.Order.STATUS;
import data.user.distributor.Distributable;

public interface OrderInterface {
    long getId();
    long getUserId();
    long getDistributorId();
    STATUS getStatus();
    void updateStatus(STATUS status);
    
    List<ItemSellable> getItems();

    float getTotalAmount();
    float getDiscountedAmount();
    void placeOrder(Distributable distributor);
}
