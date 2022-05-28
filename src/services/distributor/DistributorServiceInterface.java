package services.distributor;

import data.distributor.Distributor;
import data.kart.KartInterface;

public interface DistributorServiceInterface {
    
    void addDistributorToKart(KartInterface kart, Distributor distributor);
    
    Distributor getDistributorFromKart(KartInterface kart, long distributorId);

    void updateDistributorToKart(KartInterface kart, Distributor distributor);

    void deleteDistributorToKart(KartInterface kart, Distributor distributor);
}
