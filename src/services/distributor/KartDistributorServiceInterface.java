package services.distributor;

import data.distributor.DistributorItemOrder;
import data.kart.KartDistributor;

public interface KartDistributorServiceInterface {
    
    void addDistributorToKart(KartDistributor kart, DistributorItemOrder distributor);
    
    DistributorItemOrder getDistributorFromKart(KartDistributor kart, long distributorId);

    void updateDistributorToKart(KartDistributor kart, DistributorItemOrder distributor);

    void deleteDistributorToKart(KartDistributor kart, DistributorItemOrder distributor);
}
