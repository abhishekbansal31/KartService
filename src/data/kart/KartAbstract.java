package data.kart;

import java.util.HashMap;
import java.util.Map;

import data.user.UserAbstract;
public abstract class KartAbstract implements KartInterface {
    protected long id;
    private static Map<Long, UserAbstract> users = new HashMap<Long, UserAbstract>();
    
    @Override
    public final long getId() {
        return this.id;
    }

    @Override
    public final Map<Long, UserAbstract> getUsers() {
        return users;
    }
}
