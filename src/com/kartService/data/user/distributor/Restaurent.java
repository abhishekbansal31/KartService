package com.kartService.data.user.distributor;
import java.util.HashMap;

import com.kartService.data.item.ItemSellable;
import com.kartService.data.order.Order;
import com.kartService.services.item.ItemService;
import com.kartService.services.item.ItemServiceInterface;

public class Restaurent extends Distributable {

    private ItemServiceInterface itemService;

    public Restaurent(String name, String address, String phone) {
        this(name, address, phone, new ItemService());
    }

    public Restaurent(String name, String address, String phone, ItemServiceInterface service) {
        this.setId(getNextId());
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setItems(new HashMap<Long, ItemSellable>());
        this.setOrders(new HashMap<Long, Order>());
        this.setItemService(service);
    }

    protected final ItemServiceInterface getItemService() {
        return itemService;
    }

    public final void setItemService(ItemServiceInterface service) {
        this.itemService = service;
    }
}