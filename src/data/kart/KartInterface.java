package data.kart;

import java.util.Map;

import data.user.UserAbstract;

public interface KartInterface {
    
    long getId();
    Map<Long, UserAbstract> getUsers();
}
