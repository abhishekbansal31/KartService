package data.kart;

import java.util.Map;

import data.user.distributor.Distributable;

public interface KartDistributableInterface {
    Map<Long, Distributable> getDistributors();

    void addDistributor(Distributable dI);
    void updateDistributor(Distributable dI);
    void deleteDistributor(Distributable dI);
}
