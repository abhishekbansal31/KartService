package com.kartService.data.user;

import com.kartService.data.kart.KartCommercial;

public abstract class UserAbstract implements UserInterface {
    private long id;
    private String name;
    private String address;
    private String phone;
    private KartCommercial kart;

    private static long nextId = 0L;

    @Override
    public final long getId() {
        return this.id;
    }

    protected final void setId(long id) {
        this.id = id;
    }

    @Override
    public final String getName() {
        return this.name;
    }

    protected final void setName(String name) {
        this.name = name;
    }

    @Override
    public final String getAddress() {
        return this.address;
    }

    protected final void setAddress(String address) {
        this.address = address;
    }

    @Override
    public final String getPhone() {
        return this.phone;
    }

    protected final void setPhone(String phone) {
        this.phone = phone;
    }

    protected static final long getNextId() {
        nextId++;
        return nextId;
    }

    protected KartCommercial getKart() {
        return kart;
    }

    protected void setKart(KartCommercial kart) {
        this.kart = kart;
    }
}
