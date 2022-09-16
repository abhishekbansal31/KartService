package com.kartService.data.kart;

import com.kartService.services.user.consumer.KartConsumerService;
import com.kartService.services.user.consumer.KartConsumerServiceInterface;
import com.kartService.services.user.distributor.KartDistributorService;
import com.kartService.services.user.distributor.KartDistributorServiceInterface;

public class FoodKart extends KartCommercial {
    public FoodKart() {
        this(KartDistributorService.getInstance(), KartConsumerService.getInstance());
    }

    public FoodKart(KartDistributorServiceInterface distributorService, KartConsumerServiceInterface consumerService) {
        this.setId(getNextId());
        this.setDistributorService(distributorService);
        this.setConsumerService(consumerService);
    }
}