package data.order;

import java.util.List;

import data.item.ItemCost;

public class DeliveryOrder extends Order {

    private String deliveryAddress;
    private STATUS status;

    enum STATUS {
        PLACED,
        PROGRESS,
        ON_THE_WAY,
        DELIVERED
    }

    public DeliveryOrder(long userId, long distributorId, List<ItemCost> items, String deliveryAddress) {
        this.id = getNextId();
        this.userId = userId;
        this.distributorId = distributorId;
        this.items = items;
        this.deliveryAddress = deliveryAddress;
        this.status = STATUS.PLACED;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public STATUS getStatus() {
        return this.status;
    }
    
}
