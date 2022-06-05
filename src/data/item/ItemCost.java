package data.item;

public abstract class ItemCost extends ItemAbstract implements ItemCostInterface {
    
    protected int price;
    protected int discount;

    private static long nextId = 0L;

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
    
    protected static long getNextId() {
        nextId++;
        return nextId;
    }
}
