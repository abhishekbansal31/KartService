package data.order;

import java.util.List;

import data.item.ItemCost;
import services.order.placeOrder.DeliveryPlaceOrderService;
import services.order.placeOrder.PlaceOrderServiceInterface;

public class DeliveryOrder extends Order {
    private static PlaceOrderServiceInterface placeOrderService = new DeliveryPlaceOrderService();

    private String deliveryAddress;

    public enum STATUS {
        PLACED,
        PROGRESS,
        DISPATCHED,
        DELIVERED
    }

    public DeliveryOrder(long userId, long distributorId, List<ItemCost> items, String deliveryAddress) {
        this.id = getNextId();
        this.userId = userId;
        this.distributorId = distributorId;
        this.items = items;
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public final PlaceOrderServiceInterface getPlaceOrderService() {
        return placeOrderService;
    }
    
}
