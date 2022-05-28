package data.order;

import java.util.List;

import data.item.ItemCost;

public class DiningOrder extends Order {
    
    public DiningOrder(long userId, long distributorId, List<ItemCost> items) {
        this.id = getNextId();
        this.userId = userId;
        this.distributorId = distributorId;
        this.items = items;
    }
}
