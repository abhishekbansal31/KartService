package com.kartService.services.order.placeOrder;

public class DiningPlaceOrderService extends PlaceOrderService {
    
    private static volatile PlaceOrderServiceInterface instance = null;

    private DiningPlaceOrderService() {

    }

    public static PlaceOrderServiceInterface getInstance() {
        if(instance==null) {
            synchronized(DiningPlaceOrderService.class) {
                if(instance == null) {
                    instance = new DiningPlaceOrderService();
                }
            }
        }
        return instance;
    }
    
}
