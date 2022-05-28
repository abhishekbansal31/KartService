package data.kart;

import java.util.Map;

import data.distributor.Distributor;
import data.user.User;

public interface KartInterface {
    
    long getId();
    
    Map<Long, User> getUsers();

    Map<Long, Distributor> getDistributors();

    void addDistributor(Distributor dI);
    void updateDistributor(Distributor dI);
    void deleteDistributor(Distributor dI);
}
