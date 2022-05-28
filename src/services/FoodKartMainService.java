package services;

import java.util.ArrayList;
import java.util.Arrays;

import data.distributor.Distributor;
import data.distributor.Restaurent;
import data.item.FoodItem;
import data.item.ItemCost;
import data.kart.FoodKart;
import data.kart.KartInterface;
import data.order.DeliveryOrder;
import data.order.DiningOrder;
import data.order.Order;
import data.user.PremiumUser;
import data.user.RegularUser;
import data.user.User;

public class FoodKartMainService {
    public static void main(String[] args) {

        KartInterface kart = new FoodKart();

        User user1 = new RegularUser();
        User user2 = new RegularUser();
        User user3 = new RegularUser();

        User user4 = new PremiumUser();
        User user5 = new PremiumUser();

        Distributor distributor1 = new Restaurent("restaurent 1", "Bangalore");
        Distributor distributor2 = new Restaurent("restaurent 2", "Delhi");
        Distributor distributor3 = new Restaurent("restaurent 3", "Gurgaon");

        ItemCost item1 = new FoodItem("Paneer", 200, 10);
        ItemCost item2 = new FoodItem("Rajma", 180, 20);
        ItemCost item3 = new FoodItem("Chole", 180, 15);
        ItemCost item4 = new FoodItem("Naan", 50, 10);
        ItemCost item5 = new FoodItem("Roti", 25, 5);
        ItemCost item6 = new FoodItem("Paratha", 40, 15);
        ItemCost item7 = new FoodItem("Limca", 60, 0);
        ItemCost item8 = new FoodItem("Pepsi", 60, 0);
        ItemCost item9 = new FoodItem("Tea", 40, 10);
        ItemCost item10 = new FoodItem("Coffee", 120, 10);

        distributor1.addItem(item1);
        distributor1.addItem(item5);
        distributor1.addItem(item9);
        distributor1.addItem(item10);

        distributor2.addItem(item1);
        distributor2.addItem(item2);
        distributor2.addItem(item3);
        distributor2.addItem(item4);
        distributor2.addItem(item6);
        distributor2.addItem(item8);
        distributor2.addItem(item9);
        
        distributor3.addItem(item2);
        distributor3.addItem(item4);
        distributor3.addItem(item6);
        distributor3.addItem(item7);
        distributor3.addItem(item10);

        kart.addDistributor(distributor1);
        kart.addDistributor(distributor2);
        kart.addDistributor(distributor3);

        Order order1 = new DeliveryOrder(user1.getId(),
                                        distributor1.getId(),
                                        new ArrayList<ItemCost>(Arrays.asList(item1, item5, item10)),
                                        "Bangalore");

        Order order2 = new DiningOrder(user2.getId(),
                                        distributor1.getId(),
                                        new ArrayList<ItemCost>(Arrays.asList(item1, item5, item9)));

        Order order3 = new DeliveryOrder(user3.getId(),
                                        distributor2.getId(),
                                        new ArrayList<ItemCost>(Arrays.asList(item2, item4, item8)),
                                        "Delhi");

        Order order4 = new DiningOrder(user4.getId(),
                                        distributor2.getId(),
                                        new ArrayList<ItemCost>(Arrays.asList(item1, item6, item9)));

        Order order5 = new DeliveryOrder(user5.getId(),
                                        distributor3.getId(),
                                        new ArrayList<ItemCost>(Arrays.asList(item2, item4, item10)),
                                        "Gurgaon");
        
        distributor1.placeOrder(order1);
        distributor1.placeOrder(order2);

        distributor2.placeOrder(order3);
        distributor2.placeOrder(order4);

        distributor3.placeOrder(order5);
    }
}
