package com.kartService.data.order;
import java.util.ArrayList;
import java.util.List;

import com.kartService.data.item.ItemSellable;
import com.kartService.data.kart.KartCommercial;
import com.kartService.services.order.placeOrder.PlaceOrderServiceInterface;

public abstract class Order implements OrderInterface {
    private long id;
    private long consumerId;
    private long distributorId;
    private STATUS status;
    private List<ItemSellable> items = new ArrayList<ItemSellable>();

    public enum STATUS {
        PLACED,
        PROGRESS,
        COMPLETED
    }

    private static long nextId = 0L;

    private PlaceOrderServiceInterface placeOrderService;

    @Override
    public final long getId() {
        return id;
    }

    protected final void setId(long id) {
        this.id = id;
    }

    @Override
    public final long getConsumerId() {
        return consumerId;
    }

    protected final void setConsumerId(long consumerId) {
        this.consumerId = consumerId;
    }

    @Override
    public final long getDistributorId() {
        return distributorId;
    }

    protected final void setDistributorId(long distributorId) {
        this.distributorId = distributorId;
    }

    @Override
    public final List<ItemSellable> getItems() {
        return this.items;
    }

    protected final void setItems(List<ItemSellable> items) {
        this.items = items;
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

    @Override
    public void placeOrder(KartCommercial kart) {
        getPlaceOrderService().placeOrder(kart, this);
    }

    private final PlaceOrderServiceInterface getPlaceOrderService() {
        return placeOrderService;
    }

    @Override
    public final void setPlaceOrderService(PlaceOrderServiceInterface service) {
        this.placeOrderService = service;
    }
}
