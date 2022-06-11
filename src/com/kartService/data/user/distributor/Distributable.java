package com.kartService.data.user.distributor;
import java.util.Map;

import com.kartService.data.item.ItemSellable;
import com.kartService.data.order.Order;
import com.kartService.data.user.UserAbstract;
import com.kartService.services.item.ItemServiceInterface;

public abstract class Distributable extends UserAbstract implements DistributableInterface {

    private Map<Long, ItemSellable> items;
    private Map<Long, Order> orders;

    private ItemServiceInterface itemService;

    @Override
    public final Map<Long, ItemSellable> getItems() {
        return items;
    }

    protected final void setItems(Map<Long, ItemSellable> items) {
        this.items = items;
    }

    @Override
    public final void addItem(ItemSellable item) {
        getItemService().addItemToDistributor(this, item);
    }

    @Override
    public final void updateItem(ItemSellable item) {
        getItemService().updateItemToDistributor(this, item);
    }

    @Override
    public final void deleteItem(ItemSellable item) {
        getItemService().deleteItemFromDistributor(this, item);
    }

    @Override
    public void placeOrder(Order order) {
        orders.put(order.getId(), order);
    }

    @Override
    public final Map<Long, Order> getOrders() {
        return orders;
    }

    protected final void setOrders(Map<Long, Order> orders) {
        this.orders = orders;
    }

    @Override
    public Order getOrder(Long orderId) {
        return getOrders().get(orderId);
    }

    private final ItemServiceInterface getItemService() {
        return itemService;
    }

    public final void setItemService(ItemServiceInterface service) {
        this.itemService = service;
    }
}
