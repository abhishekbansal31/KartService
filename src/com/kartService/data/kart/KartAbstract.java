package com.kartService.data.kart;

public abstract class KartAbstract implements KartInterface {
    private long id;
    
    @Override
    public final long getId() {
        return this.id;
    }

    protected final void setId(long id) {
        this.id = id;
    }
}
