package data.kart;

import java.util.Map;

import data.distributor.DistributorItemOrder;

public interface KartDistributorInterface extends KartInterface {
    Map<Long, DistributorItemOrder> getDistributors();

    void addDistributor(DistributorItemOrder dI);
    void updateDistributor(DistributorItemOrder dI);
    void deleteDistributor(DistributorItemOrder dI);
}
