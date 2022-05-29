package data.item;

public interface ItemCostInterface extends ItemInterface {
    int getPrice();
    int getDiscount();
    float getDiscountedPrice();
}
