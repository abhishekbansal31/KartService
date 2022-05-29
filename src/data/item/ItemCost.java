package data.item;

public abstract class ItemCost implements ItemCostInterface {
    
    protected long id;
    protected String name;
    protected int price;
    protected int discount;

    private static long nextId = 0L;


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
    public final int getPrice() {
        return this.price;
    }

    public final void setPrice(int price) {
        this.price = price;
    }

    @Override
    public final int getDiscount() {
        return this.discount;
    }

    public final void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public final float getDiscountedPrice() {
        return (float)(this.getPrice() - this.getDiscount()*this.getPrice());
    }
    
    public static long getNextId() {
        nextId++;
        return nextId;
    }
}
