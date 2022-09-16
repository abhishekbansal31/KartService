package com.kartService.data.user.consumer;

import java.util.HashMap;

import com.kartService.data.kart.KartCommercial;
import com.kartService.data.order.Order;

public class RegularUser extends Consumable {

    public RegularUser(KartCommercial kart, String name, String address, String phone) {
        this.setId(getNextId());
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setOrders(new HashMap<Long, Order>());
        this.setKart(kart);
    }
    
}
