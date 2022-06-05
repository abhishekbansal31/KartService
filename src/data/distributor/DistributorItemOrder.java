package data.distributor;
import java.util.Map;

import data.item.ItemCost;
import data.order.Order;
import services.item.ItemServiceInterface;

public abstract class DistributorItemOrder extends DistributorAbstract implements DistributorItemOrderInterface {

    protected Map<Long, ItemCost> items;
    protected Map<Long, Order> orders;

    private static long nextId = 0L;

    protected abstract ItemServiceInterface getItemService();

    @Override
    public final Map<Long, ItemCost> getItems() {
        return items;
    }

    @Override
    public final void addItem(ItemCost item) {
        getItemService().addItemToDistributor(this, item);
    }

    @Override
    public final void updateItem(ItemCost item) {
        getItemService().updateItemToDistributor(this, item);
    }

    @Override
    public final void deleteItem(ItemCost item) {
        getItemService().deleteItemFromDistributor(this, item);
    }

    public final void setItems(Map<Long, ItemCost> items) {
        this.items = items;
    }

    @Override
    public final Map<Long, Order> getOrders() {
        return orders;
    }

    protected static final long getNextId() {
        nextId++;
        return nextId;
    }

    public final void placeOrder(Order order) {
        order.placeOrder(this);
    }
}
