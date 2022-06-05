package data.user;
public abstract class User {
    long id;

    private static long nextId = 0L;

    public final long getId() {
        return this.id;
    }

    protected static long getNextId() {
        nextId++;
        return nextId;
    }
}
