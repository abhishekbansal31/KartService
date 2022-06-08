package data.kart;

import java.util.HashMap;
import java.util.Map;

import data.user.distributor.DistributorItemOrder;
import services.user.distributor.KartDistributorService;
import services.user.distributor.KartDistributorServiceInterface;

public abstract class KartDistributor extends KartAbstract implements KartDistributorInterface {

    private static Map<Long, DistributorItemOrder> distributors = new HashMap<Long, DistributorItemOrder>();

    private static KartDistributorServiceInterface distributorService = new KartDistributorService();
    
    private static long nextId = 0L;

    
    @Override
    public final Map<Long, DistributorItemOrder> getDistributors() {
        return distributors;
    }

    private final KartDistributorServiceInterface getDistributorService() {
        return distributorService;
    }

    @Override
    public final void addDistributor(DistributorItemOrder dI) {
        getDistributorService().addDistributorToKart(this, dI);
    }

    @Override
    public final void updateDistributor(DistributorItemOrder dI) {
        getDistributorService().updateDistributorToKart(this, dI);
    }

    @Override
    public final void deleteDistributor(DistributorItemOrder dI) {
        getDistributorService().deleteDistributorToKart(this, dI);
    }

    protected static long getNextId() {
        nextId++;
        return nextId;
    }
}
