package data.order;

import java.util.List;

import data.item.ItemSellable;
import services.order.placeOrder.DiningPlaceOrderService;
import services.order.placeOrder.PlaceOrderServiceInterface;

public class DiningOrder extends Order {

    private PlaceOrderServiceInterface placeOrderService;
    
    public DiningOrder(long userId, long distributorId, List<ItemSellable> items) {
        this.id = getNextId();
        this.userId = userId;
        this.distributorId = distributorId;
        this.items = items;
        this.setPlaceOrderService(new DiningPlaceOrderService());
    }

    public final PlaceOrderServiceInterface getPlaceOrderService() {
        return placeOrderService;
    }

    public final void setPlaceOrderService(PlaceOrderServiceInterface service) {
        this.placeOrderService = service;
    }
}
