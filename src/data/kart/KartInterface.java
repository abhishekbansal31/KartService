package data.kart;

import java.util.Map;

import data.user.User;

public interface KartInterface {
    
    long getId();
    Map<Long, User> getUsers();
}
