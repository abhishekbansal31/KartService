package com.kartService.data.user.distributor;
import java.util.HashMap;

import com.kartService.data.item.ItemSellable;
import com.kartService.data.kart.KartCommercial;
import com.kartService.data.order.Order;
import com.kartService.services.item.ItemService;
import com.kartService.services.item.ItemServiceInterface;

public class Restaurent extends Distributable {


    public Restaurent(KartCommercial kart, String name, String address, String phone) {
        this(kart, name, address, phone, ItemService.getInstance());
    }

    public Restaurent(KartCommercial kart, String name, String address, String phone, ItemServiceInterface service) {
        this.setId(getNextId());
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setItems(new HashMap<Long, ItemSellable>());
        this.setOrders(new HashMap<Long, Order>());
        this.setKart(kart);
        this.setItemService(service);
    }
}