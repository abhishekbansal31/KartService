package data.kart;

import java.util.HashMap;
import java.util.Map;

import data.user.distributor.Distributable;
import services.user.distributor.KartDistributorServiceInterface;

public abstract class KartDistributable extends KartAbstract implements KartDistributableInterface {

    private static Map<Long, Distributable> distributors = new HashMap<Long, Distributable>();
    
    private static long nextId = 0L;

    
    @Override
    public final Map<Long, Distributable> getDistributors() {
        return distributors;
    }

    protected abstract KartDistributorServiceInterface getDistributorService();

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
}
