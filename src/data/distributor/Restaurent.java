package data.distributor;
import java.util.HashMap;

import data.item.ItemCost;
import data.order.OrderInterface;

public class Restaurent extends Distributor {

    public Restaurent(String name, String address) {
        this.id = getNextId();
        this.name = name;
        this.address = address;
        this.items = new HashMap<Long, ItemCost>();
        this.orders = new HashMap<Long, OrderInterface>();
    }
}