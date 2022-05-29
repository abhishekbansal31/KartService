package data.order;

import java.util.List;

import data.item.ItemCostInterface;
import data.order.Order.STATUS;
import services.order.placeOrder.PlaceOrderServiceInterface;

public interface OrderInterface {
    long getId();
    long getUserId();
    long getDistributorId();
    STATUS getStatus();
    void updateStatus(STATUS status);

    PlaceOrderServiceInterface getPlaceOrderService();
    
    List<ItemCostInterface> getItems();

    float getTotalAmount();
    float getDiscountedAmount();
}
