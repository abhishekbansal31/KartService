package data.item;

public class FoodItem extends ItemSellable {

    public FoodItem(String name) {
        this.name = name;
    }

    public FoodItem(String name, int price, int discount, boolean available) {
        this.id = getNextId();
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.available = available;
    }
    
}
