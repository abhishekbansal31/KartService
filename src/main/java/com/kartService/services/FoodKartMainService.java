package com.kartService.services;

import java.util.ArrayList;
import java.util.Arrays;

import com.kartService.data.item.FoodItem;
import com.kartService.data.item.ItemSellable;
import com.kartService.data.kart.FoodKart;
import com.kartService.data.kart.KartCommercial;
import com.kartService.data.order.DeliveryOrder;
import com.kartService.data.order.DiningOrder;
import com.kartService.data.order.Order;
import com.kartService.data.user.consumer.Consumable;
import com.kartService.data.user.consumer.PremiumUser;
import com.kartService.data.user.consumer.RegularUser;
import com.kartService.data.user.distributor.Distributable;
import com.kartService.data.user.distributor.Restaurent;

public class FoodKartMainService {
    public static void main(String[] args) {
    	FoodKartMainService service = new FoodKartMainService();
    	service.runService();
    }
    
    public void runService() {

        KartCommercial kart = new FoodKart();

        Consumable consumer1 = new RegularUser(kart, "Arun", "Bangalore", "2222222222");
        Consumable consumer2 = new RegularUser(kart, "Abhishek", "Delhi", "1111111111");
        Consumable consumer3 = new RegularUser(kart, "Shubham", "Gurgaon", "3333333333");

        Consumable consumer4 = new PremiumUser(kart, "Ram", "Ayodhya", "8888888888");
        Consumable consumer5 = new PremiumUser(kart, "Krishna", "Mathura", "0000000000");

        Distributable distributor1 = new Restaurent(kart, "restaurent 1", "Bangalore", "8989898989");
        Distributable distributor2 = new Restaurent(kart, "restaurent 2", "Delhi", "1212121212");
        Distributable distributor3 = new Restaurent(kart, "restaurent 3", "Gurgaon", "2323232323");

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

        kart.addConsumer(consumer1);
        kart.addConsumer(consumer2);
        kart.addConsumer(consumer3);
        kart.addConsumer(consumer4);
        kart.addConsumer(consumer5);

        kart.addDistributor(distributor1);
        kart.addDistributor(distributor2);
        kart.addDistributor(distributor3);

        Order order1 = new DeliveryOrder(consumer1.getId(),
                                        distributor1.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item1, item5, item10)),
                                        "Bangalore");

        Order order2 = new DiningOrder(consumer2.getId(),
                                        distributor1.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item1, item5, item9)));

        Order order3 = new DeliveryOrder(consumer3.getId(),
                                        distributor2.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item2, item4, item8)),
                                        "Delhi");

        Order order4 = new DiningOrder(consumer4.getId(),
                                        distributor2.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item1, item6, item9)));

        Order order5 = new DeliveryOrder(consumer5.getId(),
                                        distributor3.getId(),
                                        new ArrayList<ItemSellable>(Arrays.asList(item2, item4, item10)),
                                        "Gurgaon");
        
        kart.placeOrder(order1);
        kart.placeOrder(order2);

        kart.placeOrder(order3);
        kart.placeOrder(order4);

        kart.placeOrder(order5);
    }
}
