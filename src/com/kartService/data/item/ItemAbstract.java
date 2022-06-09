package com.kartService.data.item;

public abstract class ItemAbstract implements ItemInterface {
    
    private long id;
    private String name;

    @Override
    public final long getId() {
        return id;
    }

    protected final void setId(long id) {
        this.id = id;
    }

    @Override
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    
}
