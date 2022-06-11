package com.kartService.data.kart;

import java.util.Map;

import com.kartService.data.order.Order;
import com.kartService.data.user.consumer.Consumable;
import com.kartService.data.user.distributor.Distributable;
import com.kartService.services.user.consumer.KartConsumerServiceInterface;
import com.kartService.services.user.distributor.KartDistributorServiceInterface;

public interface KartCommercialInterface {
    
    Map<Long, Consumable> getConsumers();
    Consumable getConsumer(long consumerId);
    void addConsumer(Consumable consumer);
    void updateConsumer(Consumable consumer);
    void deleteConsumer(long consumerId);
    void setConsumerService(KartConsumerServiceInterface service);
    
    Map<Long, Distributable> getDistributors();
    Distributable getDistributor(long distributorId);
    void addDistributor(Distributable distributor);
    void updateDistributor(Distributable distributor);
    void deleteDistributor(long distributorId);
    void setDistributorService(KartDistributorServiceInterface service);

    void placeOrder(Order order);
}
