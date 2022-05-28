package data.kart;

import java.util.HashMap;
import java.util.Map;

import data.distributor.Distributor;
import data.user.User;
import services.distributor.DistributorService;
import services.distributor.DistributorServiceInterface;

public abstract class Kart implements KartInterface {
    protected long id;

    private static Map<Long, User> users = new HashMap<Long, User>();
    private static Map<Long, Distributor> distributors = new HashMap<Long, Distributor>();

    private static DistributorServiceInterface distributorService = new DistributorService();
    
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
    public final Map<Long, Distributor> getDistributors() {
        return distributors;
    }

    @Override
    public final void addDistributor(Distributor dI) {
        distributorService.addDistributorToKart(this, dI);
    }

    @Override
    public final void updateDistributor(Distributor dI) {
        distributorService.updateDistributorToKart(this, dI);
    }

    @Override
    public final void deleteDistributor(Distributor dI) {
        distributorService.deleteDistributorToKart(this, dI);
    }

    public static long getNextId() {
        nextId++;
        return nextId;
    }
}
