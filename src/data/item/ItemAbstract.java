package data.item;

public abstract class ItemAbstract implements ItemInterface {
    
    protected long id;
    protected String name;

    @Override
    public final long getId() {
        return id;
    }

    @Override
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    
}
