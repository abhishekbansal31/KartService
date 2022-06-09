package com.kartService.data.kart;

import java.util.HashMap;
import java.util.Map;

import com.kartService.data.user.distributor.Distributable;
import com.kartService.services.user.distributor.KartDistributorServiceInterface;

public abstract class KartDistributable extends KartAbstract implements KartDistributableInterface {

    private static Map<Long, Distributable> distributors = new HashMap<Long, Distributable>();
    protected KartDistributorServiceInterface distributorService;
    private static long nextId = 0L;

    
    @Override
    public final Map<Long, Distributable> getDistributors() {
        return distributors;
    }

    @Override
    public final Distributable getDistributorFromKart(long dI) {
        return getDistributorService().getDistributorFromKart(this, dI);
    }

    @Override
    public final void addDistributor(Distributable dI) {
        getDistributorService().addDistributorToKart(this, dI);
    }

    @Override
    public final void updateDistributor(Distributable dI) {
        getDistributorService().updateDistributorToKart(this, dI);
    }

    @Override
    public final void deleteDistributor(Distributable dI) {
        getDistributorService().deleteDistributorToKart(this, dI);
    }

    protected static long getNextId() {
        nextId++;
        return nextId;
    }

    private final KartDistributorServiceInterface getDistributorService() {
        return this.distributorService;
    }
}
