package data.kart;

import services.user.distributor.KartDistributorService;
import services.user.distributor.KartDistributorServiceInterface;

public class FoodKart extends KartDistributable {
    private KartDistributorServiceInterface distributorService;
    public FoodKart() {
        this.id = getNextId();
        this.setDistributorService(new KartDistributorService());
    }

    public final KartDistributorServiceInterface getDistributorService() {
        return distributorService;
    }
    private final void setDistributorService(KartDistributorServiceInterface service) {
        this.distributorService = service;
    }
}