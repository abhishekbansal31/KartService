package data.distributor;

public abstract class DistributorAbstract implements DistributorInterface {
    protected long id;
    protected String name;
    protected String address;

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

    @Override
    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

}
