package com.kartService.data.kart;

import com.kartService.services.user.distributor.KartDistributorService;
import com.kartService.services.user.distributor.KartDistributorServiceInterface;

public class FoodKart extends KartDistributable {
    public FoodKart() {
        this(new KartDistributorService());
    }

    public FoodKart(KartDistributorServiceInterface service) {
        this.setId(getNextId());
        this.setDistributorService(service);
    }
    
    public final void setDistributorService(KartDistributorServiceInterface service) {
        this.distributorService = service;
    }
}