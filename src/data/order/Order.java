package data.order;
import java.util.ArrayList;
import java.util.List;

import data.item.ItemCost;

public abstract class Order implements OrderInterface {
    protected long id;
    protected long userId;
    protected long distributorId;
    protected List<ItemCost> items = new ArrayList<ItemCost>();

    private static long nextId = 0L;

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

    public static long getNextId() {
        nextId++;
        return nextId;
    }
}
