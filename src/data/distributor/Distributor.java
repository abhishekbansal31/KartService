package data.distributor;
import java.util.Map;

import data.item.ItemCost;
import data.order.OrderInterface;
import services.item.ItemService;
import services.item.ItemServiceInterface;

public abstract class Distributor implements DistributorInterface, DistributorItemOrderInterface {
    protected long id;
    protected String name;
    protected String address;
    protected Map<Long, ItemCost> items;
    protected Map<Long, OrderInterface> orders;

    private static ItemServiceInterface itemService = new ItemService();

    private static long nextId = 0L;

    @Override
    public final long getId() {
        return id;
    }

    @Override
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    @Override
    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    @Override
    public final Map<Long, ItemCost> getItems() {
        return items;
    }

    @Override
    public final void addItem(ItemCost item) {
        itemService.addItemToDistributor(this, item);
    }

    @Override
    public final void updateItem(ItemCost item) {
        itemService.updateItemToDistributor(this, item);
    }

    @Override
    public final void deleteItem(ItemCost item) {
        itemService.deleteItemFromDistributor(this, item);
    }

    public final void setItems(Map<Long, ItemCost> items) {
        this.items = items;
    }

    @Override
    public final Map<Long, OrderInterface> getOrders() {
        return orders;
    }

    public static final long getNextId() {
        nextId++;
        return nextId;
    }

    public final void placeOrder(OrderInterface order) {
        orders.put(order.getId(), order);
        // DistributorService.addDistributorToKart(this, order);
    }
}
