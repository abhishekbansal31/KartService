package com.kartService.data.kart;

import java.util.Map;

import com.kartService.data.user.UserAbstract;

public interface KartInterface {
    
    long getId();
    Map<Long, UserAbstract> getUsers();
}
