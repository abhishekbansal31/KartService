package services.user.distributor;

import data.kart.KartDistributable;
import data.user.distributor.Distributable;

public interface KartDistributorServiceInterface {
    
    void addDistributorToKart(KartDistributable kart, Distributable distributor);
    
    Distributable getDistributorFromKart(KartDistributable kart, long distributorId);

    void updateDistributorToKart(KartDistributable kart, Distributable distributor);

    void deleteDistributorToKart(KartDistributable kart, Distributable distributor);
}
