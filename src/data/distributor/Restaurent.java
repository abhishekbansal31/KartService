package data.distributor;
import java.util.HashMap;

import data.item.ItemCostInterface;
import data.order.OrderInterface;
import services.item.ItemService;
import services.item.ItemServiceInterface;

public class Restaurent extends Distributor {

    private static ItemServiceInterface itemService = new ItemService();

    public Restaurent(String name, String address) {
        this.id = getNextId();
        this.name = name;
        this.address = address;
        this.items = new HashMap<Long, ItemCostInterface>();
        this.orders = new HashMap<Long, OrderInterface>();
    }

    public final ItemServiceInterface getItemService() {
        return itemService;
    }
}