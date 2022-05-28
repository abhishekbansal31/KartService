package data.order;

import java.util.List;

import data.item.ItemCost;

public interface OrderInterface {
    long getId();
    long getUserId();
    long getDistributorId();
    
    List<ItemCost> getItems();

    float getTotalAmount();
    float getDiscountedAmount();
}
