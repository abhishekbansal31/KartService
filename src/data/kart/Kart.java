package data.kart;

import java.util.HashMap;
import java.util.Map;

import data.distributor.DistributorItemOrderInterface;
import data.user.User;
import services.distributor.KartDistributorService;
import services.distributor.KartDistributorServiceInterface;

public abstract class Kart implements KartInterface {
    protected long id;

    private static Map<Long, User> users = new HashMap<Long, User>();
    private static Map<Long, DistributorItemOrderInterface> distributors = new HashMap<Long, DistributorItemOrderInterface>();

    private static KartDistributorServiceInterface distributorService = new KartDistributorService();
    
    private static long nextId = 0L;

    @Override
    public final long getId() {
        return this.id;
    }

    @Override
    public final Map<Long, User> getUsers() {
        return users;
    }
    
    @Override
    public final Map<Long, DistributorItemOrderInterface> getDistributors() {
        return distributors;
    }

    @Override
    public final void addDistributor(DistributorItemOrderInterface dI) {
        distributorService.addDistributorToKart(this, dI);
    }

    @Override
    public final void updateDistributor(DistributorItemOrderInterface dI) {
        distributorService.updateDistributorToKart(this, dI);
    }

    @Override
    public final void deleteDistributor(DistributorItemOrderInterface dI) {
        distributorService.deleteDistributorToKart(this, dI);
    }

    public static long getNextId() {
        nextId++;
        return nextId;
    }
}
