package data.order;

import java.util.List;

import data.item.ItemCostInterface;
import services.order.placeOrder.DiningPlaceOrderService;
import services.order.placeOrder.PlaceOrderServiceInterface;

public class DiningOrder extends Order {

    private static PlaceOrderServiceInterface placeOrderService = new DiningPlaceOrderService();
    
    public DiningOrder(long userId, long distributorId, List<ItemCostInterface> items) {
        this.id = getNextId();
        this.userId = userId;
        this.distributorId = distributorId;
        this.items = items;
    }

    public final PlaceOrderServiceInterface getPlaceOrderService() {
        return placeOrderService;
    }
}
