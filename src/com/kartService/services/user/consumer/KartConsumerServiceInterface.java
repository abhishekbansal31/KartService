package com.kartService.services.user.consumer;

import java.util.Map;

import com.kartService.data.kart.KartCommercial;
import com.kartService.data.user.consumer.Consumable;

public interface KartConsumerServiceInterface {

    Map<Long, Consumable> getConsumers(KartCommercial kart);
    
    Consumable getConsumer(KartCommercial kart, long consumerId);
    
    void addConsumer(KartCommercial kart, Consumable consumer);
    
    void updateConsumer(KartCommercial kart, Consumable consumer);
    
    void deleteConsumer(KartCommercial kart, long consumerId);
}
