package com.kartService.data.item;

public class FoodItem extends ItemSellable {

    public FoodItem(String name) {
        this.setId(getNextId());
        this.setName(name);
    }

    public FoodItem(String name, int price, int discount, boolean available) {
        this.setId(getNextId());
        this.setName(name);
        this.setPrice(price);
        this.setAvailable(available);
        this.setDiscount(discount);
    }
    
}
