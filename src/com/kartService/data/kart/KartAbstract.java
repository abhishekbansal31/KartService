package com.kartService.data.kart;

import java.util.HashMap;
import java.util.Map;

import com.kartService.data.user.UserAbstract;
public abstract class KartAbstract implements KartInterface {
    private long id;
    private static Map<Long, UserAbstract> users = new HashMap<Long, UserAbstract>();
    
    @Override
    public final long getId() {
        return this.id;
    }

    protected final void setId(long id) {
        this.id = id;
    }

    @Override
    public final Map<Long, UserAbstract> getUsers() {
        return users;
    }
}
