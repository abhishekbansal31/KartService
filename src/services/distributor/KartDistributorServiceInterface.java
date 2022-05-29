package services.distributor;

import data.distributor.DistributorItemOrderInterface;
import data.kart.KartInterface;

public interface KartDistributorServiceInterface {
    
    void addDistributorToKart(KartInterface kart, DistributorItemOrderInterface distributor);
    
    DistributorItemOrderInterface getDistributorFromKart(KartInterface kart, long distributorId);

    void updateDistributorToKart(KartInterface kart, DistributorItemOrderInterface distributor);

    void deleteDistributorToKart(KartInterface kart, DistributorItemOrderInterface distributor);
}
