package com.kartService.services.order.placeOrder;

public class DeliveryPlaceOrderService extends PlaceOrderService {
    
    private static volatile PlaceOrderServiceInterface instance = null;

    private DeliveryPlaceOrderService() {

    }

    public static PlaceOrderServiceInterface getInstance() {
        if(instance==null) {
            synchronized(DeliveryPlaceOrderService.class) {
                if(instance == null) {
                    instance = new DeliveryPlaceOrderService();
                }
            }
        }
        return instance;
    }
}
