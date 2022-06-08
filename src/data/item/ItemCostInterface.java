package data.item;

public interface ItemCostInterface extends ItemInterface {
    int getPrice();
    boolean isAvailable();
    int getDiscount();
    float getDiscountedPrice();
}
