package data.order;

import java.util.List;

import data.item.ItemSellable;
import services.order.placeOrder.DeliveryPlaceOrderService;
import services.order.placeOrder.PlaceOrderServiceInterface;

public class DeliveryOrder extends Order {
    private PlaceOrderServiceInterface placeOrderService;

    private String deliveryAddress;

    public enum STATUS {
        PLACED,
        PROGRESS,
        DISPATCHED,
        DELIVERED
    }

    public DeliveryOrder(long userId, long distributorId, List<ItemSellable> items, String deliveryAddress) {
        this.id = getNextId();
        this.userId = userId;
        this.distributorId = distributorId;
        this.items = items;
        this.deliveryAddress = deliveryAddress;
        this.setPlaceOrderService(new DeliveryPlaceOrderService());
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

    private final void setPlaceOrderService(PlaceOrderServiceInterface service) {
        this.placeOrderService = service;
    }
    
}
