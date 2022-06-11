package com.kartService.services.user.distributor;

import java.util.Map;

import com.kartService.data.kart.KartCommercial;
import com.kartService.data.user.distributor.Distributable;

public interface KartDistributorServiceInterface {
    
    Map<Long, Distributable> getDistributorsFromKart(KartCommercial kart);

    Distributable getDistributor(KartCommercial kart, long distributorId);
    
    void addDistributorToKart(KartCommercial kart, Distributable distributor);
    
    void updateDistributorToKart(KartCommercial kart, Distributable distributor);

    void deleteDistributorToKart(KartCommercial kart, long distributorId);
}
