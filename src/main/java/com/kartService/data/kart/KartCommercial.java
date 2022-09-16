package com.kartService.data.kart;

import java.util.HashMap;
import java.util.Map;

import com.kartService.data.order.Order;
import com.kartService.data.user.consumer.Consumable;
import com.kartService.data.user.distributor.Distributable;
import com.kartService.services.user.consumer.KartConsumerServiceInterface;
import com.kartService.services.user.distributor.KartDistributorServiceInterface;

public abstract class KartCommercial extends KartAbstract implements KartCommercialInterface {

    private static Map<Long, Consumable> consumers = new HashMap<Long, Consumable>();
    private KartConsumerServiceInterface consumerService;
    private static Map<Long, Distributable> distributors = new HashMap<Long, Distributable>();
    private KartDistributorServiceInterface distributorService;
    private static long nextId = 0L;

    @Override
    public final Map<Long, Consumable> getConsumers() {
        return consumers;
    }

    @Override
    public Consumable getConsumer(long consumerId) {
        return getConsumerService().getConsumer(this, consumerId);
    }

    @Override
    public final void addConsumer(Consumable consumer) {
        getConsumerService().addConsumer(this, consumer);
    }

    @Override
    public void updateConsumer(Consumable consumer) {
        getConsumerService().updateConsumer(this, consumer);
    }

    @Override
    public void deleteConsumer(long consumerId) {
        getConsumerService().deleteConsumer(this, consumerId);
    }

    private KartConsumerServiceInterface getConsumerService() {
        return this.consumerService;
    }
    
    @Override
    public void setConsumerService(KartConsumerServiceInterface service) {
        this.consumerService = service;
    }
    
    @Override
    public final Map<Long, Distributable> getDistributors() {
        return distributors;
    }

    @Override
    public final Distributable getDistributor(long distributorId) {
        return getDistributorService().getDistributor(this, distributorId);
    }

    @Override
    public final void addDistributor(Distributable distributor) {
        getDistributorService().addDistributorToKart(this, distributor);
    }

    @Override
    public final void updateDistributor(Distributable distributor) {
        getDistributorService().updateDistributorToKart(this, distributor);
    }

    @Override
    public final void deleteDistributor(long distributorId) {
        getDistributorService().deleteDistributorToKart(this, distributorId);
    }

    private final KartDistributorServiceInterface getDistributorService() {
        return this.distributorService;
    }
    
    public final void setDistributorService(KartDistributorServiceInterface service) {
        this.distributorService = service;
    }

    protected static long getNextId() {
        nextId++;
        return nextId;
    }

    @Override
    public void placeOrder(Order order) {
        order.placeOrder(this);
    }
}
