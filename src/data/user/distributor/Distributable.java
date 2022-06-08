package data.user.distributor;
import java.util.Map;

import data.item.ItemSellable;
import data.order.Order;
import data.user.UserAbstract;
import services.item.ItemServiceInterface;

public abstract class Distributable extends UserAbstract implements DistributableInterface {

    protected Map<Long, ItemSellable> items;
    protected Map<Long, Order> orders;

    protected abstract ItemServiceInterface getItemService();

    @Override
    public final Map<Long, ItemSellable> getItems() {
        return items;
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

    public final void setItems(Map<Long, ItemSellable> items) {
        this.items = items;
    }

    @Override
    public final Map<Long, Order> getOrders() {
        return orders;
    }

    protected final void setOrders(Map<Long, Order> orders) {
        this.orders = orders;
    }

    public final void placeOrder(Order order) {
        order.placeOrder(this);
    }
}
