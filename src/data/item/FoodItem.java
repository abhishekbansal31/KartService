package data.item;

public class FoodItem extends ItemCost {

    public FoodItem(String name) {
        this.name = name;
    }

    public FoodItem(String name, int price, int discount) {
        this.id = getNextId();
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    
}
