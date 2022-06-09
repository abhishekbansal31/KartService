package com.kartService.data.kart;

import java.util.Map;

import com.kartService.data.user.distributor.Distributable;
import com.kartService.services.user.distributor.KartDistributorServiceInterface;

public interface KartDistributableInterface {
    Map<Long, Distributable> getDistributors();

    Distributable getDistributorFromKart(long distributorId);
    void addDistributor(Distributable dI);
    void updateDistributor(Distributable dI);
    void deleteDistributor(Distributable dI);
    void setDistributorService(KartDistributorServiceInterface service);
}
