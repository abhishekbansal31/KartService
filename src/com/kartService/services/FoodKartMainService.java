package com.kartService.services;

import java.util.ArrayList;
import java.util.Arrays;

import com.kartService.data.item.FoodItem;
import com.kartService.data.item.ItemSellable;
import com.kartService.data.kart.FoodKart;
import com.kartService.data.kart.KartDistributable;
import com.kartService.data.order.DeliveryOrder;
import com.kartService.data.order.DiningOrder;
import com.kartService.data.order.Order;
import com.kartService.data.user.UserAbstract;
import com.kartService.data.user.consumer.PremiumUser;
import com.kartService.data.user.consumer.RegularUser;
import com.kartService.data.user.distributor.Distributable;
import com.kartService.data.user.distributor.Restaurent;

public class FoodKartMainService {
    public static void main(String[] args) {

        KartDistributable kart = new FoodKart();

        UserAbstract user1 = new RegularUser("Arun", "Bangalore", "2222222222");
        UserAbstract user2 = new RegularUser("Abhishek", "Delhi", "1111111111");
        UserAbstract user3 = new RegularUser("Shubham", "Gurgaon", "3333333333");

        UserAbstract user4 = new PremiumUser("Ram", "Ayodhya", "8888888888");
        UserAbstract user5 = new PremiumUser("Krishna", "Mathura", "0000000000");

        Distributable distributor1 = new Restaurent("restaurent 1", "Bangalore", "8989898989");
        Distributable distributor2 = new Restaurent("restaurent 2", "Delhi", "1212121212");
        Distributable distributor3 = new Restaurent("restaurent 3", "Gurgaon", "2323232323");

        ItemSellable item1 = new FoodItem("Paneer", 200, 10, true);
        ItemSellable item2 = new FoodItem("Rajma", 180, 20, true);
        ItemSellable item3 = new FoodItem("Chole", 180, 15, true);
        ItemSellable item4 = new FoodItem("Naan", 50, 10, true);
        ItemSellable item5 = new FoodItem("Roti", 25, 5, true);
        ItemSellable item6 = new FoodItem("Paratha", 40, 15, true);
        ItemSellable item7 = new FoodItem("Limca", 60, 0, true);
        ItemSellable item8 = new FoodItem("Pepsi", 60, 0, true);
        ItemSellable item9 = new FoodItem("Tea", 40, 10, true);
        ItemSellable item10 = new FoodItem("Coffee", 120, 10, true);

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
                                        new ArrayList<ItemSellable>(Arrays.asList(item1, item5, item10)),
                                        "Bangalore");

        Order order2 = new DiningOrder(user2.getId(),
                                        distributor1.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item1, item5, item9)));

        Order order3 = new DeliveryOrder(user3.getId(),
                                        distributor2.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item2, item4, item8)),
                                        "Delhi");

        Order order4 = new DiningOrder(user4.getId(),
                                        distributor2.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item1, item6, item9)));

        Order order5 = new DeliveryOrder(user5.getId(),
                                        distributor3.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item2, item4, item10)),
                                        "Gurgaon");
        
        distributor1.placeOrder(order1);
        distributor1.placeOrder(order2);

        distributor2.placeOrder(order3);
        distributor2.placeOrder(order4);

        distributor3.placeOrder(order5);
    }
}