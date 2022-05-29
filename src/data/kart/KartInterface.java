package data.kart;

import java.util.Map;

import data.distributor.DistributorItemOrderInterface;
import data.user.User;

public interface KartInterface {
    
    long getId();
    
    Map<Long, User> getUsers();

    Map<Long, DistributorItemOrderInterface> getDistributors();

    void addDistributor(DistributorItemOrderInterface dI);
    void updateDistributor(DistributorItemOrderInterface dI);
    void deleteDistributor(DistributorItemOrderInterface dI);
}
