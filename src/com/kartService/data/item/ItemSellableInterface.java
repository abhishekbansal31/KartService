package com.kartService.data.item;

public interface ItemSellableInterface {
    int getPrice();
    boolean isAvailable();
    int getDiscount();
    float getDiscountedPrice();
}
