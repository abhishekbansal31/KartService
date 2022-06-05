package data.kart;

import java.util.HashMap;
import java.util.Map;

import data.user.User;
public abstract class KartAbstract implements KartInterface {
    protected long id;
    private static Map<Long, User> users = new HashMap<Long, User>();
    
    @Override
    public final long getId() {
        return this.id;
    }

    @Override
    public final Map<Long, User> getUsers() {
        return users;
    }
}
