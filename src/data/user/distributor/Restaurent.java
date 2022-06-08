package data.user.distributor;
import java.util.HashMap;

import data.item.ItemSellable;
import data.order.Order;
import services.item.ItemService;
import services.item.ItemServiceInterface;

public class Restaurent extends Distributable {

    private ItemServiceInterface itemService;

    public Restaurent(String name, String address, String phone) {
        this.setId(getNextId());
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setItems(new HashMap<Long, ItemSellable>());
        this.setOrders(new HashMap<Long, Order>());
        this.setItemService(new ItemService());
    }

    public final ItemServiceInterface getItemService() {
        return itemService;
    }

    private final void setItemService(ItemServiceInterface service) {
        this.itemService = service;
    }
}