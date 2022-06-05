package data.distributor;
import java.util.HashMap;

import data.item.ItemCost;
import data.order.Order;
import services.item.ItemService;
import services.item.ItemServiceInterface;

public class Restaurent extends DistributorItemOrder {

    private static ItemServiceInterface itemService = new ItemService();

    public Restaurent(String name, String address) {
        this.id = getNextId();
        this.name = name;
        this.address = address;
        this.items = new HashMap<Long, ItemCost>();
        this.orders = new HashMap<Long, Order>();
    }

    public final ItemServiceInterface getItemService() {
        return itemService;
    }
}