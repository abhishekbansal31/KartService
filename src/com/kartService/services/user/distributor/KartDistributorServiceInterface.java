package com.kartService.services.user.distributor;

import java.util.Map;

import com.kartService.data.kart.KartDistributable;
import com.kartService.data.user.distributor.Distributable;

public interface KartDistributorServiceInterface {
    
    void addDistributorToKart(KartDistributable kart, Distributable distributor);
    
    Distributable getDistributorFromKart(KartDistributable kart, long distributorId);
    
    Map<Long, Distributable> getDistributorsFromKart(KartDistributable kart);

    void updateDistributorToKart(KartDistributable kart, Distributable distributor);

    void deleteDistributorToKart(KartDistributable kart, Distributable distributor);
}
