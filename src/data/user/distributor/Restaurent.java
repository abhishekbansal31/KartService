package data.user.distributor;
import java.util.HashMap;

import data.item.ItemCost;
import data.order.Order;
import services.item.ItemService;
import services.item.ItemServiceInterface;

public class Restaurent extends DistributorItemOrder {

    private static ItemServiceInterface itemService = new ItemService();

    public Restaurent(String name, String address, String phone) {
        this.setId(getNextId());
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setItems(new HashMap<Long, ItemCost>());
        this.setOrders(new HashMap<Long, Order>());
    }

    public final ItemServiceInterface getItemService() {
        return itemService;
    }
}