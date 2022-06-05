package data.distributor;
import java.util.Map;

import data.item.ItemCostInterface;
import data.order.OrderInterface;
import services.item.ItemServiceInterface;

public abstract class Distributor implements DistributorItemOrderInterface {
    protected long id;
    protected String name;
    protected String address;
    protected Map<Long, ItemCostInterface> items;
    protected Map<Long, OrderInterface> orders;

    private static long nextId = 0L;

    protected abstract ItemServiceInterface getItemService();

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
    public final Map<Long, ItemCostInterface> getItems() {
        return items;
    }

    @Override
    public final void addItem(ItemCostInterface item) {
        getItemService().addItemToDistributor(this, item);
    }

    @Override
    public final void updateItem(ItemCostInterface item) {
        getItemService().updateItemToDistributor(this, item);
    }

    @Override
    public final void deleteItem(ItemCostInterface item) {
        getItemService().deleteItemFromDistributor(this, item);
    }

    public final void setItems(Map<Long, ItemCostInterface> items) {
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
        order.placeOrder(this);
    }
}
