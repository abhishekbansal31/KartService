package data.order;
import java.util.ArrayList;
import java.util.List;

import data.item.ItemCost;
import data.user.distributor.DistributorItemOrder;
import services.order.placeOrder.PlaceOrderServiceInterface;

public abstract class Order implements OrderInterface {
    protected long id;
    protected long userId;
    protected long distributorId;
    private STATUS status;
    protected List<ItemCost> items = new ArrayList<ItemCost>();

    public enum STATUS {
        PLACED,
        PROGRESS,
        COMPLETED
    }

    private static long nextId = 0L;

    protected abstract PlaceOrderServiceInterface getPlaceOrderService();

    @Override
    public final long getId() {
        return id;
    }

    @Override
    public final long getUserId() {
        return userId;
    }

    @Override
    public final long getDistributorId() {
        return distributorId;
    }

    @Override
    public final List<ItemCost> getItems() {
        return this.items;
    }

    @Override
    public final float getTotalAmount() {
        return (float)0;
    }

    @Override
    public final float getDiscountedAmount() {
        return (float)0;
    }

    protected static long getNextId() {
        nextId++;
        return nextId;
    }

    public STATUS getStatus() {
        return this.status;
    }

    public void updateStatus(STATUS status) {
        this.status = status;
    }

    public final void placeOrder(DistributorItemOrder distributor) {
        getPlaceOrderService().placeOrder(distributor, this);
    }
}
