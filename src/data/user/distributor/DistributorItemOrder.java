package data.user.distributor;
import java.util.Map;

import data.item.ItemCost;
import data.order.Order;
import data.user.UserAbstract;
import services.item.ItemServiceInterface;

public abstract class DistributorItemOrder extends UserAbstract implements DistributorItemOrderInterface {

    protected Map<Long, ItemCost> items;
    protected Map<Long, Order> orders;

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

    protected final void setOrders(Map<Long, Order> orders) {
        this.orders = orders;
    }

    public final void placeOrder(Order order) {
        order.placeOrder(this);
    }
}
