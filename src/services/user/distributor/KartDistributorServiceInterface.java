package services.user.distributor;

import data.kart.KartDistributor;
import data.user.distributor.DistributorItemOrder;

public interface KartDistributorServiceInterface {
    
    void addDistributorToKart(KartDistributor kart, DistributorItemOrder distributor);
    
    DistributorItemOrder getDistributorFromKart(KartDistributor kart, long distributorId);

    void updateDistributorToKart(KartDistributor kart, DistributorItemOrder distributor);

    void deleteDistributorToKart(KartDistributor kart, DistributorItemOrder distributor);
}
